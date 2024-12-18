package com.facebook.flipper.plugins.bloksdebugger;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ScriptStatus {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ScriptStatus[] A01;
    public static final ScriptStatus A02;

    public static ScriptStatus valueOf(String str) {
        return (ScriptStatus) Enum.valueOf(ScriptStatus.class, str);
    }

    public static ScriptStatus[] values() {
        return (ScriptStatus[]) A01.clone();
    }

    static {
        ScriptStatus scriptStatus = new ScriptStatus("Success", 0);
        A02 = scriptStatus;
        ScriptStatus[] scriptStatusArr = {scriptStatus, new ScriptStatus("Error", 1)};
        A01 = scriptStatusArr;
        A00 = AbstractC12190kN.A00(scriptStatusArr);
    }

    public ScriptStatus(String str, int i) {
    }
}
