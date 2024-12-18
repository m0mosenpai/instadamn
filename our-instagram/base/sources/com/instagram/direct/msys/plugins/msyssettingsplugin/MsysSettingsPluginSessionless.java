package com.instagram.direct.msys.plugins.msyssettingsplugin;

import X.C4Mo;
import X.C4Mp;

/* loaded from: classes3.dex */
public final class MsysSettingsPluginSessionless extends Sessionless {
    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public String MsysSettingsImpl_MsysCreateCopyOfStringSetting(String str, String str2) {
        String string;
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null && (string = c4Mp.A00.getString(str, str2)) != null) {
            return string;
        }
        return str2;
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public boolean MsysSettingsImpl_MsysReadBooleanSetting(String str, boolean z) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            return c4Mp.A00.getBoolean(str, z);
        }
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public double MsysSettingsImpl_MsysReadDoubleSetting(String str, double d) {
        throw new RuntimeException("Not implemented");
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public int MsysSettingsImpl_MsysReadInt32Setting(String str, int i) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            return (int) c4Mp.A00.getLong(str, i);
        }
        return i;
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public long MsysSettingsImpl_MsysReadInt64Setting(String str, long j) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            return c4Mp.A00.getLong(str, j);
        }
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public boolean MsysSettingsImpl_MsysReadSettingIsNull(String str) {
        if (C4Mo.A00 != null) {
            return !r0.A00.contains(str);
        }
        return true;
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public void MsysSettingsImpl_MsysRemoveSetting(String str) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            c4Mp.A00.edit().remove(str).apply();
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteBooleanSetting(String str, boolean z) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            c4Mp.A00.edit().putBoolean(str, z).apply();
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteDoubleSetting(String str, double d) {
        throw new RuntimeException("Not implemented");
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteInt32Setting(String str, int i) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            c4Mp.A00.edit().putLong(str, i).apply();
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteInt64Setting(String str, long j) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            c4Mp.A00.edit().putLong(str, j).apply();
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyssettingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteStringSetting(String str, String str2) {
        C4Mp c4Mp = C4Mo.A00;
        if (c4Mp != null) {
            c4Mp.A00.edit().putString(str, str2).apply();
        }
    }
}
