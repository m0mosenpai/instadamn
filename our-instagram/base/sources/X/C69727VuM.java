package X;

import java.util.List;

/* renamed from: X.VuM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69727VuM {
    public C69646Vsn A00;
    public C68753VbW A01;
    public Integer A02;
    public String A04;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(new C50159MDm(this, 36));
    public String A03 = "";
    public String A05 = "";
    public final InterfaceC09390do A0A = AbstractC09440dt.A01(new C50159MDm(this, 35));

    public final C69646Vsn A00() {
        C69646Vsn c69646Vsn = this.A00;
        if (c69646Vsn != null) {
            return c69646Vsn;
        }
        C14360o3.A0F("metadata");
        throw C00O.createAndThrow();
    }

    public final Integer A01() {
        Integer num = this.A02;
        if (num != null) {
            return num;
        }
        C14360o3.A0F("entityType");
        throw C00O.createAndThrow();
    }
}
