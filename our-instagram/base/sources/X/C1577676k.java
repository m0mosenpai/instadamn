package X;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;

/* renamed from: X.76k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1577676k extends AbstractC66422zJ {
    public FrameLayout A00;
    public FrameLayout A01;
    public IgdsFaceSwarm A02;
    public C5SW A03 = null;
    public boolean A04;
    public final Activity A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C159627Dy A08;
    public final C1577476i A09;
    public final InterfaceC164947Zj A0A;
    public final AnonymousClass988 A0B;
    public final C7IM A0C;
    public final C98N A0D;

    private void A00(C57012jc c57012jc, String str, boolean z) {
        int i = 8;
        if (str != null) {
            TextView textView = (TextView) c57012jc.A01();
            textView.setText(((InterfaceC165377aQ) this.A0A).ChE(str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (z) {
                i = 0;
            }
        }
        c57012jc.A03(i);
    }

    private boolean A01(C7M0 c7m0) {
        int i = c7m0.A01;
        if (i != 26) {
            if (i != 32 && i != 62) {
                if (i != 1013 && i != 1003 && i != 1004) {
                    return true;
                }
            } else {
                return ((Boolean) this.A0B.A0x.getValue()).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x04c5, code lost:
    
        if (r1 <= 1) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0402, code lost:
    
        if (r1 != 62) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0421, code lost:
    
        if (((java.lang.Boolean) r25.A0B.A0x.getValue()).booleanValue() != false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0260  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r26, X.C3OO r27) {
        /*
            Method dump skipped, instructions count: 1699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577676k.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44777Jry(layoutInflater.inflate(R.layout.direct_thread_context_lines, viewGroup, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C7M0.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        ((C7WC) this.A0A).Dw6();
        this.A01 = null;
    }

    public C1577676k(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159627Dy c159627Dy, C1577476i c1577476i, InterfaceC164947Zj interfaceC164947Zj, AnonymousClass988 anonymousClass988, C7IM c7im, C98N c98n) {
        this.A05 = activity;
        this.A07 = userSession;
        this.A0A = interfaceC164947Zj;
        this.A0B = anonymousClass988;
        this.A06 = interfaceC11380iw;
        this.A0C = c7im;
        this.A08 = c159627Dy;
        this.A0D = c98n;
        this.A09 = c1577476i;
    }
}
