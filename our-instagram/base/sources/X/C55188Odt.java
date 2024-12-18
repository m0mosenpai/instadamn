package X;

import android.content.Context;
import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.camera.gen.CameraModel;
import com.facebook.rsys.screenshare.gen.ScreenShareModel;
import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Odt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55188Odt {
    public int A00;
    public int A01;
    public AbstractC53622NnT A02;
    public BinderC50748MbA A03;
    public String A04;
    public HashSet A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final WIJ A09;
    public final C55060OaF A0A;
    public final C55093Ob4 A0B;
    public final C0P5 A0C;
    public final FoaUserSession A0D;
    public final Map A0E;
    public final Map A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC16820sZ A0I;
    public final InterfaceC16820sZ A0J;
    public final InterfaceC16820sZ A0K;
    public final InterfaceC16660sJ A0L;
    public final boolean A0M;

    public static final void A01(C55188Odt c55188Odt) {
        HashSet A1H;
        c55188Odt.A06 = false;
        c55188Odt.A07 = false;
        if (c55188Odt.A0M) {
            A1H = AbstractC16830sb.A05(4);
        } else {
            A1H = AbstractC166987dD.A1H();
        }
        c55188Odt.A05 = A1H;
        c55188Odt.A0E.clear();
        c55188Odt.A02 = null;
        if (c55188Odt.A03 != null) {
            try {
                c55188Odt.A08.unbindService(c55188Odt.A09);
            } catch (NullPointerException e) {
                C0w9.A01.EmP("RtcNotificationController", "unbindService threw exception", e);
                OXE.A00.A02("RtcNotificationController", "unbindService threw exception", e);
            }
            BinderC50748MbA binderC50748MbA = c55188Odt.A03;
            if (binderC50748MbA != null) {
                binderC50748MbA.A00 = null;
            }
            c55188Odt.A03 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r8.getApplicationInfo().targetSdkVersion < 34) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C55188Odt(android.content.Context r8, X.C55093Ob4 r9, com.meta.foa.session.FoaUserSession r10) {
        /*
            r7 = this;
            X.OaF r6 = new X.OaF
            r6.<init>(r8, r9)
            X.0b3 r0 = X.C0b3.A00()
            X.0Qb r5 = r0.A07()
            X.PcV r4 = X.C57309PcV.A00
            X.PcW r3 = X.C57310PcW.A00
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 < r2) goto L20
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 1
            if (r0 >= r2) goto L21
        L20:
            r1 = 0
        L21:
            r0 = 4
            X.AbstractC167017dG.A1U(r4, r3)
            r7.<init>()
            r7.A08 = r8
            r7.A0B = r9
            r7.A0D = r10
            r7.A0A = r6
            r7.A0C = r5
            r7.A0I = r4
            r7.A0K = r3
            r7.A0M = r1
            if (r1 == 0) goto L81
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0}
            java.util.HashSet r0 = X.AbstractC16830sb.A05(r0)
        L46:
            r7.A05 = r0
            java.util.LinkedHashMap r0 = X.AbstractC166987dD.A1I()
            r7.A0E = r0
            r0 = 22
            X.0sx r0 = X.C57549PgN.A01(r7, r0)
            r7.A0H = r0
            java.util.LinkedHashMap r0 = X.AbstractC166987dD.A1I()
            r7.A0F = r0
            X.0dv r1 = X.EnumC09460dv.A02
            r0 = 20
            X.0do r0 = X.C57549PgN.A00(r7, r1, r0)
            r7.A0G = r0
            r1 = 21
            X.PgN r0 = new X.PgN
            r0.<init>(r7, r1)
            r7.A0J = r0
            r1 = 3
            X.WIJ r0 = new X.WIJ
            r0.<init>(r7, r1)
            r7.A09 = r0
            r1 = 18
            X.MLk r0 = new X.MLk
            r0.<init>(r7, r1)
            r7.A0L = r0
            return
        L81:
            java.util.HashSet r0 = X.AbstractC166987dD.A1H()
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55188Odt.<init>(android.content.Context, X.Ob4, com.meta.foa.session.FoaUserSession):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x020f, code lost:
    
        if (r20.A05.add(128) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019e, code lost:
    
        if (r1 != 3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.AbstractC53622NnT r19, X.C55188Odt r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55188Odt.A00(X.NnT, X.Odt, boolean, boolean):void");
    }

    private final boolean A02(CallModel callModel) {
        if (!this.A05.contains(128)) {
            ArrayList arrayList = callModel.selfParticipant.mediaState.audioStreams;
            C14360o3.A06(arrayList);
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i = ((AudioStream) it.next()).streamState;
                    if (i == 3 || i == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean A03(CameraModel cameraModel) {
        if (!this.A05.contains(64) && cameraModel != null && cameraModel.cameraOn) {
            return true;
        }
        return false;
    }

    private final boolean A04(ScreenShareModel screenShareModel, ScreenShareModel screenShareModel2) {
        Integer num;
        if (this.A05.contains(32)) {
            Integer num2 = null;
            if (screenShareModel2 != null) {
                num = Integer.valueOf(screenShareModel2.screenShareState);
            } else {
                num = null;
            }
            if (screenShareModel != null) {
                num2 = Integer.valueOf(screenShareModel.screenShareState);
            }
            if (!C14360o3.A0K(num, num2) && screenShareModel2 != null && screenShareModel2.screenShareState == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
