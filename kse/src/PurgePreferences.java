/*
 * Copyright 2004 - 2013 Wayne Grant
 *           2013 - 2022 Kai Kramer
 *
 * This file is part of KeyStore Explorer.
 *
 * KeyStore Explorer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * KeyStore Explorer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with KeyStore Explorer.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.kse.ApplicationSettings;

/**
 * Erase all KSE application preferences.
 */
public class PurgePreferences {
    /**
     * Erase all KSE application preferences.
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        try {
            ApplicationSettings applicationSettings = ApplicationSettings.getInstance();
            applicationSettings.clear();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
