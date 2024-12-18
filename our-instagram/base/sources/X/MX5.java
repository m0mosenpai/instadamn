package X;

import android.graphics.PointF;
import android.graphics.Rect;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MX5 implements AnonymousClass841 {
    public final UserSession A00;
    public final CreationSession A01;

    @Override // X.AnonymousClass841
    public final MX5 End(String str) {
        C14360o3.A0B(str, 0);
        CreationSession creationSession = this.A01;
        MediaSession mediaSession = creationSession.A07;
        if (mediaSession != null) {
            creationSession.A0E.remove(mediaSession);
            creationSession.A07 = null;
        }
        creationSession.A07(str, null, true);
        return this;
    }

    public static CreationSession A00(MediaCaptureActivity mediaCaptureActivity) {
        AnonymousClass841 anonymousClass841 = mediaCaptureActivity.A09.A00;
        anonymousClass841.getClass();
        return ((MX5) anonymousClass841).A01;
    }

    public static EnumC69983Ch A01(Object obj) {
        EnumC69983Ch enumC69983Ch = ((MX5) obj).A01.A0A;
        enumC69983Ch.getClass();
        return enumC69983Ch;
    }

    public static C47Z A02(InterfaceC189598ae interfaceC189598ae, Object obj) {
        return interfaceC189598ae.BcC(((MX5) obj).A01.A0C);
    }

    @Override // X.AnonymousClass841
    public final MX5 A9Y(String str, String str2, boolean z) {
        this.A01.A07(str, str2, z);
        return this;
    }

    @Override // X.AnonymousClass841
    public final float AB3() {
        float f = this.A01.A00;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    @Override // X.AnonymousClass841
    public final float ACq() {
        VideoSession A04 = this.A01.A04();
        A04.getClass();
        return A04.A00;
    }

    @Override // X.AnonymousClass841
    public final EnumC69983Ch AGq() {
        EnumC69983Ch enumC69983Ch = this.A01.A0A;
        enumC69983Ch.getClass();
        return enumC69983Ch;
    }

    @Override // X.AnonymousClass842
    public final C5L6 ANZ() {
        C5L6 c5l6 = this.A01.A05;
        if (c5l6 == null) {
            return C5L6.A0E;
        }
        return c5l6;
    }

    @Override // X.AnonymousClass841
    public final int ATe() {
        CreationSession creationSession = this.A01;
        if (creationSession.A02() != null) {
            return creationSession.A02().A0D.getValue();
        }
        return 0;
    }

    @Override // X.AnonymousClass841
    public final boolean CLO() {
        MediaCaptureConfig mediaCaptureConfig = this.A01.A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A00 != null) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass841
    public final boolean CLX() {
        Iterator it = this.A01.A0E.iterator();
        while (it.hasNext()) {
            if (MSW.A0R(it).Btq() == C05F.A00) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass841
    public final boolean CMB() {
        Iterator it = this.A01.A0E.iterator();
        while (it.hasNext()) {
            if (MSW.A0R(it).Btq() == C05F.A01) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass841
    public final boolean CPp() {
        return AbstractC167007dF.A1W(this.A01.A0C);
    }

    @Override // X.AnonymousClass841
    public final List CpK() {
        return AbstractC31172DnG.A19(this.A01.A0E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r3.A03 == false) goto L23;
     */
    @Override // X.AnonymousClass841
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C22925A8v E2F() {
        /*
            r11 = this;
            com.instagram.creation.base.CreationSession r1 = r11.A01
            int r2 = r1.A00()
            int r0 = r1.A01()
            int r8 = java.lang.Math.min(r2, r0)
            X.5L6 r3 = r1.A05
            if (r3 != 0) goto L14
            X.5L6 r3 = X.C5L6.A0E
        L14:
            X.5L6 r0 = X.C5L6.A0E
            r10 = 0
            if (r3 != r0) goto L20
            r1 = r8
        L1a:
            X.A8v r0 = new X.A8v
            r0.<init>(r8, r1, r10, r10)
            return r0
        L20:
            java.lang.String r0 = r1.A0C
            if (r0 == 0) goto L80
            r2 = 1
            float r4 = r1.A00
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L2e
            r4 = 1065353216(0x3f800000, float:1.0)
        L2e:
            if (r2 == 0) goto L7d
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L7b
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            X.PmZ r0 = r0.A0D
            int r0 = r0.getValue()
        L40:
            int r0 = r0 % 180
            if (r0 == 0) goto L49
            boolean r0 = r3.A03
            r9 = 1
            if (r0 != 0) goto L4a
        L49:
            r9 = 0
        L4a:
            int r5 = r1.A01()
            int r6 = r1.A00()
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L79
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            X.PmZ r0 = r0.A0D
            int r7 = r0.getValue()
        L62:
            X.3AY r1 = X.MX2.A08(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r1.A00
            r0.getClass()
            int r8 = X.AbstractC166987dD.A0H(r0)
            java.lang.Object r0 = r1.A01
            r0.getClass()
            int r1 = X.AbstractC166987dD.A0H(r0)
            goto L1a
        L79:
            r7 = 0
            goto L62
        L7b:
            r0 = 0
            goto L40
        L7d:
            boolean r9 = r3.A03
            goto L4a
        L80:
            r2 = 0
            float r4 = r3.A00
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MX5.E2F():X.A8v");
    }

    @Override // X.AnonymousClass841
    public final String E3z() {
        MediaSession mediaSession = this.A01.A07;
        if (mediaSession != null) {
            return mediaSession.BcD();
        }
        return null;
    }

    @Override // X.AnonymousClass841
    public final String E4J() {
        PhotoSession A02 = this.A01.A02();
        A02.getClass();
        String str = A02.A0B;
        C14360o3.A07(str);
        return str;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.OL6] */
    @Override // X.AnonymousClass841
    public final void ELl(InterfaceC189598ae interfaceC189598ae) {
        CreationSession creationSession = this.A01;
        List list = creationSession.A0Q;
        list.clear();
        Iterator it = creationSession.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            ?? obj = new Object();
            String BcD = A0R.BcD();
            if (BcD == null) {
                C0f5 AEp = C18950wb.A01.AEp("setPendingMediaKey", 817891240);
                AEp.ABW(DialogModule.KEY_MESSAGE, "pending media key should not be null");
                AEp.report();
            }
            obj.A06 = BcD;
            obj.A04 = A0R;
            Integer Btq = A0R.Btq();
            if (Btq == C05F.A00) {
                obj.A01(A0R.B6P());
            } else if (Btq == C05F.A01) {
                C47Z BcC = interfaceC189598ae.BcC(BcD);
                if (BcC == null) {
                    AbstractC12120kG.A01("CreationSession_saveMediaSessionStates", "pendingMedia is null and media type Video media session state was not saved.");
                } else {
                    obj.A03 = BcC.A1i.A01;
                    obj.A02 = BcC.A05;
                    ClipInfo clipInfo = BcC.A1N;
                    obj.A01 = clipInfo.A07;
                    obj.A00 = clipInfo.A05;
                    obj.A07 = BcC.A5F;
                }
            }
            list.add(obj);
        }
        creationSession.A0H = false;
    }

    @Override // X.AnonymousClass841
    public final void EPV(String str) {
        CreationSession creationSession = this.A01;
        creationSession.A0E.clear();
        creationSession.A07 = null;
        creationSession.A0H = false;
        creationSession.A0C = str;
    }

    @Override // X.AnonymousClass841
    public final void EPt(float f) {
        VideoSession A04 = this.A01.A04();
        A04.getClass();
        A04.A00 = f;
    }

    @Override // X.AnonymousClass841
    public final MX5 ESV(Rect rect, int i, int i2) {
        CreationSession creationSession = this.A01;
        CropInfo cropInfo = new CropInfo(rect, i, i2);
        if (creationSession.A02() != null) {
            creationSession.A02().A05 = cropInfo;
        }
        return this;
    }

    @Override // X.AnonymousClass841
    public final void ETx(int i) {
        PhotoSession A02 = this.A01.A02();
        A02.getClass();
        ((C56216OxP) A02.A0D).A00.A01 = i;
    }

    @Override // X.AnonymousClass841
    public final MX5 Eab(String str) {
        MediaSession mediaSession = this.A01.A07;
        if (mediaSession != null) {
            mediaSession.Eac(str);
        }
        return this;
    }

    @Override // X.AnonymousClass841
    public final MX5 Enb(String str, String str2) {
        CreationSession creationSession = this.A01;
        MediaSession mediaSession = creationSession.A07;
        if (mediaSession != null) {
            creationSession.A0E.remove(mediaSession);
            creationSession.A07 = null;
        }
        creationSession.A07(str, str2, false);
        return this;
    }

    @Override // X.AnonymousClass841
    public final List FDe() {
        CreationSession creationSession = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = creationSession.A0E.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            if (A0R.Btq() == C05F.A01) {
                A1E.add(A0R);
            }
        }
        return AbstractC31172DnG.A19(A1E);
    }

    public MX5(UserSession userSession, CreationSession creationSession) {
        this.A01 = creationSession;
        this.A00 = userSession;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.NnK] */
    @Override // X.AnonymousClass841
    public final void AAI(PointF pointF, String str, float f) {
        AbstractC167017dG.A1N(str, pointF);
        CreationSession creationSession = this.A01;
        Float valueOf = Float.valueOf(f);
        Map map = creationSession.A0R;
        float floatValue = valueOf.floatValue();
        ?? obj = new Object();
        obj.A01 = pointF;
        obj.A00 = floatValue;
        map.put(str, obj);
    }
}
