package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.memorytimeline.MemoryTimeline;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62882tR extends C1I2 implements InterfaceC60602pj, InterfaceC62892tS {
    public MemoryTimeline A00;
    public C62942tX A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public List A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public final UserSession A0D;
    public final C006802i A0E;
    public final C63132tq A0F;

    public C62882tR(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, int i) {
        this(activity, interfaceC11380iw, userSession, null, null, null, null, null, null, null, null, i);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void A01(int i, int i2, int i3, boolean z) {
        if (z) {
            if (i == 0) {
                this.A01.A0G.A0A = "top_of_list_view";
            } else {
                boolean z2 = false;
                if (i2 == i3) {
                    z2 = true;
                }
                C63022tf c63022tf = this.A01.A0G;
                if (z2) {
                    c63022tf.A0A = "end_of_list_view";
                } else {
                    c63022tf.A0A = "mid_of_list_view";
                }
            }
        }
        A02(z);
        if (!z) {
            if (i == 0) {
                this.A01.A02("top_of_list_view");
                return;
            }
            boolean z3 = false;
            if (i2 == i3) {
                z3 = true;
            }
            C62942tX c62942tX = this.A01;
            if (z3) {
                c62942tX.A02("end_of_list_view");
            } else {
                c62942tX.A02("mid_of_list_view");
            }
        }
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C62942tX c62942tX = this.A01;
        c62942tX.A0G.A0A = "on_pause";
        C62942tX.A00(c62942tX);
        A00(true);
        C63132tq c63132tq = this.A0F;
        if (c63132tq.A00) {
            c63132tq.A00 = false;
            c63132tq.A01.markerEnd(23592986, (short) 2);
        }
    }

    private void A00(boolean z) {
        C006802i c006802i = this.A0E;
        int hashCode = hashCode();
        if (!z) {
            c006802i.markerStart(23592980, hashCode);
        } else {
            c006802i.markerEnd(23592980, hashCode, (short) 2);
        }
    }

    public final void A02(boolean z) {
        int A03 = C0f9.A03(21450523);
        this.A01.A03(z);
        A00(z);
        this.A0F.A00(z);
        C0f9.A0A(-1912333253, A03);
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        Integer num;
        int A03 = C0f9.A03(-1474912393);
        C62942tX c62942tX = this.A01;
        if (f < f2) {
            num = C05F.A0C;
        } else {
            num = C05F.A0N;
        }
        c62942tX.A0G.A09 = num;
        C0f9.A0A(-153629500, A03);
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        int A03 = C0f9.A03(-1221069828);
        boolean z = false;
        if (c3vz == C3VZ.A03) {
            z = true;
        }
        this.A01.A03(z);
        A00(z);
        this.A0F.A00(z);
        C0f9.A0A(652562996, A03);
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        Integer num;
        Integer num2;
        int A03 = C0f9.A03(384942584);
        if (c3fq.CXX()) {
            int i6 = this.A0C;
            if (i != i6) {
                C62942tX c62942tX = this.A01;
                if (i > i6) {
                    num2 = C05F.A01;
                } else {
                    num2 = C05F.A00;
                }
                c62942tX.A0G.A09 = num2;
            }
            this.A0C = i;
        } else {
            C62942tX c62942tX2 = this.A01;
            c62942tX2.A03 = true;
            C63022tf c63022tf = c62942tX2.A0G;
            c63022tf.A03 += i4;
            c63022tf.A04 += i5;
            c63022tf.A00 += Math.abs(i4);
            c63022tf.A01 += Math.abs(i5);
            c62942tX2.A0F.onScrolled(i4, i5);
            if (i4 != 0) {
                if (i4 > 0) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A0C;
                }
            } else if (i5 != 0) {
                if (i5 > 0) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
            }
            c63022tf.A09 = num;
        }
        C0f9.A0A(-2008928340, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int i2;
        int A03 = C0f9.A03(996156292);
        if (i == 2) {
            i2 = -769652546;
        } else {
            boolean z = false;
            if (i == 0) {
                z = true;
            }
            A01(c3fq.B6q(), c3fq.BM3(), c3fq.getCount() - 1, z);
            i2 = 323201153;
        }
        C0f9.A0A(i2, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r43, 2342153805195378992L) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        if (r52 == 23592971) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62882tR(android.app.Activity r41, X.InterfaceC11380iw r42, com.instagram.common.session.UserSession r43, java.lang.Boolean r44, java.lang.Boolean r45, X.InterfaceC08830cm r46, X.InterfaceC08830cm r47, X.InterfaceC08830cm r48, X.InterfaceC08830cm r49, X.InterfaceC08830cm r50, X.InterfaceC08830cm r51, int r52) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62882tR.<init>(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, java.lang.Boolean, java.lang.Boolean, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, int):void");
    }
}
