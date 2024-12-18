package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Dy9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31790Dy9 extends C193578hc {
    public String A00;
    public final Locale A01;
    public final InterfaceC24731Iq A02;
    public final InterfaceC19390xP A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C18920wW A06;
    public final List A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31790Dy9(Application application, C18920wW c18920wW, String str, List list, Locale locale) {
        super(application);
        AbstractC25233BEq.A0x(3, c18920wW, str, application);
        this.A07 = list;
        this.A01 = locale;
        this.A06 = c18920wW;
        this.A00 = str;
        C008002u A00 = C10E.A00(null);
        this.A05 = A00;
        C007802s A01 = AnonymousClass111.A01(new C43171J6q(this, null, 15), A00);
        this.A04 = AbstractC208910l.A01(new C51750MtZ(A00(this, null), 1), AbstractC141776au.A00(this), A01, C10I.A01);
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A02 = c24721Ip;
        this.A03 = AbstractC07080Za.A03(c24721Ip);
    }

    public final void A0E(C32110E9i c32110E9i) {
        C14360o3.A0B(c32110E9i, 0);
        String str = c32110E9i.A02;
        Locale locale = this.A01;
        if (!AbstractC31180DnO.A1Z(this.A00, AbstractC31172DnG.A16(locale, str), locale)) {
            this.A00 = str;
            AbstractC166987dD.A1Z(new PZL(c32110E9i, this, null, 30), AbstractC141776au.A00(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A00(C31790Dy9 c31790Dy9, String str) {
        ?? r6;
        if (str != null && str.length() != 0) {
            Locale locale = c31790Dy9.A01;
            String A16 = AbstractC31172DnG.A16(locale, str);
            List list = c31790Dy9.A07;
            r6 = AbstractC166987dD.A1E();
            for (Object obj : list) {
                C32110E9i c32110E9i = (C32110E9i) obj;
                Application A0D = c31790Dy9.A0D();
                String A162 = AbstractC31172DnG.A16(locale, c32110E9i.A02);
                String A163 = AbstractC31172DnG.A16(locale, AbstractC166997dE.A0p(A0D, c32110E9i.A01));
                String A164 = AbstractC31172DnG.A16(locale, AbstractC166997dE.A0p(A0D, c32110E9i.A00));
                if (AbstractC001900j.A0a(A162, A16, false) || AbstractC001900j.A0a(A163, A16, false) || AbstractC001900j.A0a(A164, A16, false)) {
                    r6.add(obj);
                }
            }
        } else {
            r6 = c31790Dy9.A07;
        }
        ArrayList A0q = AbstractC167017dG.A0q(r6);
        for (C32110E9i c32110E9i2 : r6) {
            String str2 = c31790Dy9.A00;
            Locale locale2 = c31790Dy9.A01;
            A0q.add(new C51758Mth(c32110E9i2, AbstractC31180DnO.A1Z(c32110E9i2.A02, AbstractC31172DnG.A16(locale2, str2), locale2)));
        }
        return A0q;
    }
}
