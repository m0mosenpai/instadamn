package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import java.util.LinkedHashSet;

/* renamed from: X.3Ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69633Ax {
    public static final Object A08 = new Object();
    public String A00;
    public final C57112jm A01;
    public final C63622uj A02 = new C63622uj();
    public final C61602rN A03;
    public final C3B0 A04;
    public final C69653Az A05;
    public final C69643Ay A06;
    public final java.util.Set A07;

    public final void A00(View view, Reel reel, C70873Fz c70873Fz, Boolean bool, int i) {
        final C61602rN c61602rN;
        C73173Ps c73173Ps = new C73173Ps(c70873Fz, bool, i);
        String A0R = AnonymousClass001.A0R(reel.getId(), this.A00);
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(reel, c73173Ps, A0R);
        c59072n8.A00(this.A06);
        C63622uj c63622uj = this.A02;
        if (C59062n7.A07 == c63622uj.A00("reel_tray") && (c61602rN = this.A03) != null) {
            Object obj = A08;
            C59072n8 c59072n82 = new C59072n8(obj, obj, "reel_tray");
            c59072n82.A00(new InterfaceC43071ya(c61602rN) { // from class: X.3Pt
                public static final InterfaceC61612rO A04 = new Object();
                public long A01;
                public final C61602rN A03;
                public long A00 = -1;
                public InterfaceC61612rO A02 = A04;

                @Override // X.InterfaceC43071ya
                public final void ATP(C59062n7 c59062n72, InterfaceC57162jr interfaceC57162jr) {
                    C14360o3.A0B(c59062n72, 0);
                    C14360o3.A0B(interfaceC57162jr, 1);
                    int intValue = interfaceC57162jr.CFq(c59062n72).intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            this.A02 = A04;
                            this.A01 = 0L;
                            this.A00 = -1L;
                            return;
                        }
                    } else {
                        C61602rN c61602rN2 = this.A03;
                        if (c61602rN2.A0L) {
                            long j = c61602rN2.A0B;
                            if (this.A02 != c61602rN2) {
                                this.A02 = c61602rN2;
                                this.A01 = j;
                            }
                        }
                        this.A00 = interfaceC57162jr.BmE();
                    }
                    long BmE = interfaceC57162jr.BmE() - this.A00;
                    InterfaceC61612rO interfaceC61612rO = this.A02;
                    InterfaceC61612rO interfaceC61612rO2 = A04;
                    if (interfaceC61612rO == interfaceC61612rO2 || BmE < this.A01) {
                        return;
                    }
                    interfaceC61612rO.Dig();
                    this.A02 = interfaceC61612rO2;
                }

                {
                    this.A03 = c61602rN;
                }
            });
            c63622uj.A01(c59072n82.A01(), "reel_tray");
        }
        c59072n8.A00 = c63622uj.A00("reel_tray");
        this.A01.A05(view, c59072n8.A01());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.3Az] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3B0, java.lang.Object] */
    public C69633Ax(C57112jm c57112jm, C61602rN c61602rN, C64012vM c64012vM, C61252qn c61252qn) {
        this.A01 = c57112jm;
        this.A03 = c61602rN;
        this.A06 = new C69643Ay(c64012vM, c61252qn);
        ?? obj = new Object();
        obj.A00 = c64012vM;
        this.A05 = obj;
        ?? obj2 = new Object();
        obj2.A00 = c64012vM;
        this.A04 = obj2;
        this.A00 = new String();
        this.A07 = new LinkedHashSet();
    }
}
