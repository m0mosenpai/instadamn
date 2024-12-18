package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.ErW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33497ErW implements InterfaceC02530Ab {
    IMPRESSION("impression"),
    CONFIRMED("confirmed"),
    DISMISSED(DialogModule.ACTION_DISMISSED),
    TOGGLE_ON("toggle_on"),
    TOGGLE_OFF("toggle_off"),
    TOGGLE_UNCHANGED_ON("toggle_unchanged_on"),
    TOGGLE_UNCHANGED_OFF("toggle_unchanged_off");

    public final String A00;

    EnumC33497ErW(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
