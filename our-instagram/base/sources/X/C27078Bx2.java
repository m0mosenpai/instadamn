package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bx2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27078Bx2 extends C3PD implements InterfaceC30935Dip {
    public final int A00;
    public final Object A01;

    public C27078Bx2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C3PD c3pd;
        int i = this.A00;
        C14360o3.A0B(view, 0);
        Object obj = this.A01;
        if (i != 0) {
            C25444BNj c25444BNj = (C25444BNj) obj;
            if (c25444BNj.A02.CdW()) {
                c25444BNj.A09.A06(view, null, null);
            }
            c3pd = c25444BNj.A04;
        } else {
            C26583Bog c26583Bog = (C26583Bog) obj;
            C75113Zb c75113Zb = c26583Bog.A04.A0E;
            if (c75113Zb != null && c75113Zb.A1p) {
                C38321qM c38321qM = c26583Bog.A03.A02;
                if (c38321qM == null) {
                    return true;
                }
                UserSession userSession = c26583Bog.A05;
                C14360o3.A0B(userSession, 0);
                AbstractC25234BEr.A1N(userSession, c38321qM);
                return true;
            }
            c26583Bog.A0A.A06(view, null, null);
            c3pd = c26583Bog.A06;
        }
        c3pd.DsE(view);
        return true;
    }

    @Override // X.InterfaceC30935Dip
    public final void Dty(MotionEvent motionEvent, View view) {
        C75113Zb c75113Zb;
        if (this.A00 != 0) {
            C76493bt c76493bt = C76493bt.A00;
            C25444BNj c25444BNj = (C25444BNj) this.A01;
            if (c76493bt.A0b(motionEvent, c25444BNj.A01, c25444BNj.A02)) {
                c25444BNj.A00.onTouch(view, motionEvent);
                return;
            }
            return;
        }
        C76493bt c76493bt2 = C76493bt.A00;
        C26583Bog c26583Bog = (C26583Bog) this.A01;
        ClipsViewerConfig clipsViewerConfig = c26583Bog.A02;
        C120985dq c120985dq = c26583Bog.A03;
        if (!c76493bt2.A0b(motionEvent, clipsViewerConfig, c120985dq) || (c75113Zb = c26583Bog.A04.A0E) == null || c75113Zb.A1p) {
            return;
        }
        c26583Bog.A09.Dbd(c120985dq, c26583Bog.A08, c26583Bog.A07.getModuleName());
    }
}
