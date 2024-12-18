package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95934Tc {
    public C4XR A00;
    public String A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final C2VQ A05;
    public final C46272Ao A06;
    public final C95794Sn A07;
    public final C4TP A08;
    public final C459929j A09;
    public final ServiceEventCallbackImpl A0A;
    public final C4TV A0B;
    public final InterfaceC95914Ta A0C;
    public final C123185ht A0D;
    public final C123195hu A0E;
    public final HeroPlayerSetting A0F;
    public final Map A0G;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.4UM] */
    private DefaultAudioSink A00() {
        C4UD c4ud = C4UD.A01;
        ArrayList arrayList = new ArrayList();
        C4UE[] c4ueArr = (C4UE[]) arrayList.toArray(new C4UE[arrayList.size()]);
        c4ueArr.getClass();
        C4UF c4uf = new C4UF(c4ueArr);
        c4ud.getClass();
        if (!TextUtils.isEmpty(null)) {
            AtomicReference atomicReference = C46642Cc.A0G;
            C14360o3.A0B(null, 0);
        } else if (!TextUtils.isEmpty(null)) {
            AtomicReference atomicReference2 = C46642Cc.A0G;
            C14360o3.A0B(null, 0);
        } else {
            return new DefaultAudioSink(c4ud, c4uf, new Object());
        }
        throw C00O.createAndThrow();
    }

    public static C92124As A01(Context context, C4SS c4ss, HeroPlayerSetting heroPlayerSetting) {
        android.net.Uri parse = android.net.Uri.parse("");
        C4AN c4an = c4ss.A0K;
        String str = c4an.A0G;
        String str2 = c4an.A09;
        android.net.Uri uri = c4an.A05;
        if (uri != null) {
            parse = uri;
        }
        C92124As A02 = AbstractC92114Ar.A02(parse, new C92074An(context, heroPlayerSetting, str, false), str2);
        if (A02 != null) {
            return A02;
        }
        throw new IOException("Missing manifest");
    }

    public static String A02(C4BR c4br) {
        List list;
        if (c4br != null && (list = c4br.A01) != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = ((C4BB) list.get(i2)).A02.A05;
            }
            Arrays.sort(iArr);
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i3 = size - 1;
                if (i < i3) {
                    sb.append(iArr[i]);
                    sb.append(":");
                    i++;
                } else {
                    sb.append(iArr[i3]);
                    return sb.toString();
                }
            }
        } else {
            return "";
        }
    }

    public final AbstractC96044Tn A03(C4SS c4ss, C4BL c4bl) {
        C459929j c459929j = this.A09;
        HeroPlayerSetting heroPlayerSetting = this.A0F;
        C96014Tk c96014Tk = new C96014Tk(c459929j);
        C41861wa c41861wa = heroPlayerSetting.A01;
        if (c41861wa != null && ((c41861wa.A0O && heroPlayerSetting.A10.A0e) || heroPlayerSetting.A10.A0d)) {
            Context context = this.A03;
            C2VQ c2vq = this.A05;
            C117365Sv c117365Sv = new C117365Sv(c96014Tk, c2vq, null, true);
            long j = heroPlayerSetting.A0k;
            Handler handler = this.A04;
            C4TV c4tv = this.A0B;
            boolean z = heroPlayerSetting.A3O;
            boolean z2 = heroPlayerSetting.A2h;
            boolean z3 = heroPlayerSetting.A1J;
            boolean z4 = false;
            String str = c4ss.A0K.A0B;
            if (!TextUtils.isEmpty(str) && heroPlayerSetting.A1C.contains(str)) {
                z4 = true;
            }
            C117385Sx c117385Sx = new C117385Sx(context, handler, new C65723Tsw(c4ss, this), c96014Tk, c2vq, c117365Sv, c4bl, c4tv, null, j, heroPlayerSetting.A2r);
            c117385Sx.A0N = z;
            c117385Sx.A0G = false;
            c117385Sx.A0M = z2;
            ((AbstractC97194Ye) c117385Sx).A0c = false;
            ((AbstractC97194Ye) c117385Sx).A0X = z3;
            ((AbstractC97194Ye) c117385Sx).A0b = z4;
            return c117385Sx;
        }
        Context context2 = this.A03;
        C2VQ c2vq2 = this.A05;
        long j2 = heroPlayerSetting.A0k;
        C4XR c4xr = this.A00;
        Handler handler2 = this.A04;
        C4TV c4tv2 = this.A0B;
        boolean z5 = heroPlayerSetting.A3O;
        boolean z6 = heroPlayerSetting.A2h;
        boolean z7 = heroPlayerSetting.A1J;
        boolean z8 = false;
        String str2 = c4ss.A0K.A0B;
        if (!TextUtils.isEmpty(str2) && heroPlayerSetting.A1C.contains(str2)) {
            z8 = true;
        }
        C96024Tl c96024Tl = new C96024Tl(context2, handler2, c96014Tk, c2vq2, c4xr, c4bl, c4tv2, j2);
        c96024Tl.A0X = z5;
        c96024Tl.A0T = false;
        c96024Tl.A0Y = z6;
        c96024Tl.A0S = null;
        ((AbstractC96034Tm) c96024Tl).A0O = false;
        ((AbstractC96034Tm) c96024Tl).A0K = z7;
        ((AbstractC96034Tm) c96024Tl).A0N = z8;
        return c96024Tl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x03ec, code lost:
    
        if (r10.A0R != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03ee, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03ef, code lost:
    
        r5 = new X.C96254Ui(r11.getLooper(), new X.C96234Ug(r1), new X.C96214Ue(r48, r46, r0));
        r4 = new X.C96264Uj(r48, r46);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0409, code lost:
    
        if (r10 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x040d, code lost:
    
        if (r10.A0Q == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x040f, code lost:
    
        r2 = new X.C4Un(r11.getLooper(), X.InterfaceC96284Ul.A00, r4, r2.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0426, code lost:
    
        return new X.InterfaceC96054To[]{r16, r8, r5, r2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0427, code lost:
    
        r2 = new X.C121005ds(r11.getLooper(), X.InterfaceC96284Ul.A00, r4, r2.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04c9, code lost:
    
        if (r10 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0182, code lost:
    
        if (r47.A08 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x019c, code lost:
    
        if (r1.A1d == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        if (r49.A0T == false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC96054To[] A05(X.C4SS r47, final X.C95794Sn r48, X.C92124As r49) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95934Tc.A05(X.4SS, X.4Sn, X.4As):X.4To[]");
    }

    public C95934Tc(Context context, Handler handler, C46282Ap c46282Ap, C95794Sn c95794Sn, C4TP c4tp, ServiceEventCallbackImpl serviceEventCallbackImpl, InterfaceC95914Ta interfaceC95914Ta, C123185ht c123185ht, C123195hu c123195hu, Map map) {
        C2VP c2vp;
        this.A03 = context;
        this.A0G = map;
        HeroPlayerSetting heroPlayerSetting = c46282Ap.A06;
        this.A0F = heroPlayerSetting;
        this.A06 = c46282Ap.A05;
        this.A04 = handler;
        this.A0A = serviceEventCallbackImpl;
        this.A09 = new C459929j(serviceEventCallbackImpl);
        this.A07 = c95794Sn;
        this.A0E = c123195hu;
        this.A0D = c123185ht;
        this.A08 = c4tp;
        C460829s.A01 = heroPlayerSetting.A2Q;
        this.A0B = new C4TV(c95794Sn, c123185ht, c123195hu, heroPlayerSetting);
        if (heroPlayerSetting.A2j) {
            c2vp = new C2VP();
            c2vp.A09 = heroPlayerSetting.A2F;
            c2vp.A08 = heroPlayerSetting.A2E;
            c2vp.A00 = heroPlayerSetting.A0P;
            c2vp.A01 = heroPlayerSetting.A0Q;
            c2vp.A0B = heroPlayerSetting.A3T;
            c2vp.A06 = heroPlayerSetting.A1s;
            c2vp.A02 = heroPlayerSetting.A0i;
            c2vp.A0A = heroPlayerSetting.A2N;
            c2vp.A07 = heroPlayerSetting.A2C;
            c2vp.A03 = heroPlayerSetting.A10.A04;
            c2vp.A04 = heroPlayerSetting.A1W;
        } else {
            c2vp = new C2VP();
            c2vp.A06 = heroPlayerSetting.A1s;
            c2vp.A02 = heroPlayerSetting.A0i;
            c2vp.A0A = heroPlayerSetting.A2N;
            c2vp.A07 = heroPlayerSetting.A2C;
            c2vp.A03 = heroPlayerSetting.A10.A04;
            c2vp.A0B = heroPlayerSetting.A3T;
        }
        c2vp.A05 = heroPlayerSetting.A1f;
        this.A05 = new C2VQ(c2vp);
        this.A0C = interfaceC95914Ta;
    }

    public final boolean A04(C4AN c4an) {
        String A00;
        if (c4an.A02()) {
            HeroPlayerSetting heroPlayerSetting = this.A0F;
            String str = "null";
            if (AbstractC97784aH.A01(heroPlayerSetting.A19, heroPlayerSetting.A2x)) {
                ServiceEventCallbackImpl serviceEventCallbackImpl = this.A0A;
                String str2 = c4an.A0G;
                if (str2 != null) {
                    str = str2;
                }
                serviceEventCallbackImpl.callback(new C97144Xz(str, "AV1_INSTANTIATION", "AV1_INSTANTIATION", AbstractC97784aH.A00(this.A01, true)));
                A00 = AbstractC97784aH.A00(this.A01, true);
            } else {
                if (!this.A02 && Build.VERSION.SDK_INT < 30) {
                    return true;
                }
                ServiceEventCallbackImpl serviceEventCallbackImpl2 = this.A0A;
                String str3 = c4an.A0G;
                if (str3 != null) {
                    str = str3;
                }
                serviceEventCallbackImpl2.callback(new C97144Xz(str, "AV1_INSTANTIATION", "AV1_INSTANTIATION", AbstractC97784aH.A00(this.A01, false)));
                A00 = AbstractC97784aH.A00(this.A01, false);
            }
            AbstractC459729h.A01("HeroExo2InitHelper", A00, new Object[0]);
        }
        return false;
    }
}
