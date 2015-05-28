/*****************************************************************************
 * AndroidUtil.java
 *****************************************************************************
 * Copyright © 2015 VLC authors, VideoLAN and VideoLabs
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston MA 02110-1301, USA.
 *****************************************************************************/

package org.videolan.libvlc.util;

import android.net.Uri;
import android.os.Build;

import java.io.File;

/**
 * Created by tom on 28/05/15.
 */
public class AndroidUtil {
    public static boolean isFroyoOrLater() {
        return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.FROYO;
    }

    public static boolean isGingerbreadOrLater() {
        return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.GINGERBREAD;
    }

    public static boolean isHoneycombOrLater() {
        return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB;
    }

    public static boolean isHoneycombMr1OrLater() {
        return android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    public static boolean isICSOrLater() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }

    public static boolean isJellyBeanOrLater() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
    }

    public static boolean isJellyBeanMR1OrLater() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }

    public static boolean isJellyBeanMR2OrLater() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    public static boolean isKitKatOrLater() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }

    public static boolean isLolliPopOrLater() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    public static File URItoFile(String URI) {
        if (URI == null) return null;
        return new File(Uri.decode(URI).replaceFirst("file://", ""));
    }

    /**
     * Quickly converts path to URIs, which are mandatory in libVLC.
     *
     * @param path
     *            The path to be converted.
     * @return A URI representation of path
     */
    public static String PathToURI(String path) {
        if (path == null) {
            throw new NullPointerException("Cannot convert null path!");
        }

        File f = new File(path);
        return f.toURI().toString();
    }
}