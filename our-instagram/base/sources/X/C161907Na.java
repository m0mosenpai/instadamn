package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.7Na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161907Na {
    public ViewGroup A00;
    public EnumC161927Nc A01;
    public AnonymousClass195 A02;
    public boolean A03;
    public boolean A04;
    public final C161917Nb A05;
    public final C7NX A06;
    public final C19L A07;

    public final void A01(EnumC161927Nc enumC161927Nc) {
        C14360o3.A0B(enumC161927Nc, 0);
        if (!this.A03 && enumC161927Nc == EnumC161927Nc.A05) {
            this.A03 = true;
        }
        EnumC161927Nc enumC161927Nc2 = this.A01;
        if (enumC161927Nc2 != EnumC161927Nc.A05 || enumC161927Nc != EnumC161927Nc.A07) {
            if (enumC161927Nc2 == enumC161927Nc && enumC161927Nc == EnumC161927Nc.A06) {
                AnonymousClass195 anonymousClass195 = this.A02;
                if (anonymousClass195 != null) {
                    anonymousClass195.AGH(null);
                }
                C19L c19l = this.A07;
                C206639Cu c206639Cu = new C206639Cu(this, null, 4);
                this.A02 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, c19l);
            } else {
                this.A05.A03(enumC161927Nc);
            }
            this.A01 = enumC161927Nc;
        }
    }

    public final void A00(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (C14360o3.A0K(this.A00, viewGroup)) {
            this.A00 = null;
            C7NX c7nx = this.A06;
            c7nx.A00();
            C70167WEj c70167WEj = c7nx.A01;
            if (c70167WEj != null) {
                FrameLayout frameLayout = c70167WEj.A09;
                ViewParent parent = frameLayout.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    viewGroup2.removeView(frameLayout);
                }
            }
        }
    }

    public C161907Na(C7NX c7nx) {
        this.A06 = c7nx;
        this.A05 = new C161917Nb(c7nx);
        AnonymousClass197 anonymousClass197 = new AnonymousClass197(null);
        C12T c12t = C12P.A00;
        this.A07 = AnonymousClass194.A02(anonymousClass197.plus(AnonymousClass131.A00));
        this.A01 = EnumC161927Nc.A08;
    }
}
