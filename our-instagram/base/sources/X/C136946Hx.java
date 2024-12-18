package X;

import android.content.Context;
import android.media.AudioManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.6Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136946Hx {
    public MediaFrameLayout A00;
    public C5TA A01;
    public final Context A02;
    public final AudioManager A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC74953Yl A05;
    public final InterfaceC74953Yl A06;
    public final InterfaceC74953Yl A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final InterfaceC74953Yl A0A;
    public final CQ7 A0B;
    public final C136936Hw A0C;
    public final UserSession A0D;
    public final InterfaceC60442pS A0E;
    public final C6C3 A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public InterfaceC60022ok volumeKeyListener;

    public C136946Hx(Context context, InterfaceC74953Yl interfaceC74953Yl, C136936Hw c136936Hw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        this.A02 = context;
        this.A0D = userSession;
        this.A0E = interfaceC60442pS;
        this.A0G = str;
        this.A0C = c136936Hw;
        this.A0I = z;
        this.A0A = interfaceC74953Yl;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A05 = new ParcelableSnapshotMutableState(A00, null);
        this.A07 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), null);
        this.A08 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), null);
        this.A06 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), null);
        this.A09 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), Float.valueOf(0.0f));
        this.A04 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), false);
        this.A0H = interfaceC60442pS.getModuleName();
        this.A0B = (CQ7) userSession.A01(CQ7.class, DAK.A00);
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A03 = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.A0F = new C27289C2v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C75363a3 r19) {
        /*
            r18 = this;
            r15 = 0
            r9 = r19
            X.C14360o3.A0B(r9, r15)
            r3 = r18
            com.instagram.common.session.UserSession r0 = r3.A0D
            X.1DX r0 = X.C1DW.A00(r0)
            java.lang.String r7 = r9.A0G
            X.1qM r1 = r0.A02(r7)
            if (r1 == 0) goto La1
            com.instagram.ui.widget.framelayout.MediaFrameLayout r8 = r3.A00
            if (r8 == 0) goto La1
            boolean r0 = r9.A0U
            if (r0 == 0) goto La1
            r14 = -1
            X.4S7 r10 = new X.4S7
            r10.<init>(r1, r14)
            X.J22 r1 = new X.J22
            r1.<init>(r9)
            java.lang.String r12 = r3.A0H
            X.0xB r0 = new X.0xB
            r0.<init>(r12)
            r8.setVideoSource(r1, r0)
            X.3Yl r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            X.0sZ r0 = (X.InterfaceC16820sZ) r0
            if (r0 == 0) goto L40
            r0.invoke()
        L40:
            X.CQ7 r5 = r3.A0B
            int r0 = r3.hashCode()
            java.lang.String r6 = r3.A0G
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.util.Map r2 = r5.A00
            r0 = 58
            java.lang.String r1 = X.AnonymousClass001.A0T(r7, r6, r0)
            r2.put(r4, r1)
            r16 = 1
            java.util.Map r5 = r5.A01
            java.lang.String r1 = X.AnonymousClass001.A0T(r7, r6, r0)
            java.lang.Object r4 = r5.get(r1)
            X.5TA r4 = (X.C5TA) r4
            r2 = 1
            r1 = 0
            if (r4 == 0) goto Lb5
            r3.A01 = r4
            r4.A07(r8)
            X.6C3 r0 = r3.A0F
            X.C14360o3.A0B(r0, r15)
            r4.A00 = r0
            X.4QW r0 = r4.A06
            X.4QT r0 = (X.C4QT) r0
            float r0 = r0.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L80
            r2 = 0
        L80:
            boolean r0 = r3.A0I
            if (r0 == 0) goto La2
            X.6Hw r0 = r3.A0C
            X.6G3 r0 = r0.A04
            X.3Yl r1 = r0.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
        L8e:
            r1.Egh(r0)
        L91:
            boolean r2 = r3.A06()
            X.5TA r1 = A00(r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L9e
            r0 = 0
        L9e:
            r1.A02(r0, r15)
        La1:
            return
        La2:
            boolean r0 = r3.A06()
            if (r0 == r2) goto L91
            if (r2 == 0) goto L91
            X.6Hw r0 = r3.A0C
            X.6G3 r0 = r0.A04
            X.3Yl r1 = r0.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            goto L8e
        Lb5:
            X.5TA r1 = A00(r3)
            java.lang.String r0 = X.AnonymousClass001.A0T(r7, r6, r0)
            r5.put(r0, r1)
            boolean r0 = r3.A06()
            r0 = r0 ^ 1
            r10.A00 = r0
            X.5TA r7 = A00(r3)
            r11 = 0
            boolean r0 = r10.A00
            r13 = 0
            if (r0 == 0) goto Ld4
            r13 = 1065353216(0x3f800000, float:1.0)
        Ld4:
            r17 = r15
            r7.A08(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136946Hx.A01(X.3a3):void");
    }

    public final void A03(String str) {
        this.A04.Egh(false);
        A00(this).A09(str);
    }

    public static final C5TA A00(C136946Hx c136946Hx) {
        C5TA c5ta = c136946Hx.A01;
        if (c5ta == null) {
            Context context = c136946Hx.A02;
            UserSession userSession = c136946Hx.A0D;
            C5TA c5ta2 = new C5TA(context, userSession, new C30O(userSession, c136946Hx.A0E, null, false), c136946Hx.A0F, c136946Hx.A0H);
            c5ta2.A01();
            c136946Hx.A01 = c5ta2;
            return c5ta2;
        }
        return c5ta;
    }

    public final void A04(String str) {
        CQ7 cq7 = this.A0B;
        int hashCode = hashCode();
        Map map = cq7.A00;
        map.remove(Integer.valueOf(hashCode));
        String str2 = this.A0G;
        if (!map.values().contains(AnonymousClass001.A0T(str, str2, ':'))) {
            A00(this).A0C("on_dispose", false);
            cq7.A01.remove(AnonymousClass001.A0T(str, str2, ':'));
        }
    }

    public final boolean A06() {
        InterfaceC74963Ym interfaceC74963Ym;
        boolean z = this.A0I;
        C136936Hw c136936Hw = this.A0C;
        if (z) {
            interfaceC74963Ym = c136936Hw.A01;
        } else {
            interfaceC74963Ym = c136936Hw.A02;
        }
        return ((Boolean) interfaceC74963Ym.getValue()).booleanValue();
    }

    public final void A02(Integer num, boolean z) {
        int i;
        C5TA A00 = A00(this);
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        A00.A02(f, i);
        C136936Hw c136936Hw = this.A0C;
        boolean z2 = this.A0I;
        C6G3 c6g3 = c136936Hw.A04;
        if (z2) {
            c6g3.A05.Egh(Boolean.valueOf(z));
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        c6g3.A08.Egh(Boolean.valueOf(z));
    }

    public final void A05(String str, boolean z) {
        if (!A00(this).A0E()) {
            if (A00(this).A0F()) {
                A00(this).A0B("resume", z);
            } else {
                A00(this).A0B(str, z);
            }
        }
    }
}
