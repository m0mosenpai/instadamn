package X;

import java.util.Observable;

/* renamed from: X.3NG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NG extends Observable implements InterfaceC12870lZ {
    public static C3NG A02;
    public String A00 = "";
    public boolean A01 = true;

    public final void A00(String str, String str2, String str3) {
        if (str == null) {
            str = "null";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = str2;
        }
        this.A00 = AbstractC13670mt.A06("%s\nV1: %s\nV2: %s", str, str2, str3);
        setChanged();
        notifyObservers();
    }

    public C3NG() {
        C218914p.A03(EnumC220415e.A03, this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(999799061);
        this.A01 = false;
        setChanged();
        notifyObservers();
        C0f9.A0A(-1889941938, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1913549138);
        this.A01 = true;
        setChanged();
        notifyObservers();
        C0f9.A0A(-162586604, A03);
    }
}
