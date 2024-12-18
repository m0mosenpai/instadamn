package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class AkX implements MQE {
    public final Context A00;
    public final UserSession A01;

    public static final int A00(List list) {
        return Color.argb((int) ((AbstractC167007dF.A04(list, 3) * 255.0f) + 0.5f), (int) ((AbstractC167007dF.A04(list, 0) * 255.0f) + 0.5f), (int) ((AbstractC167007dF.A04(list, 1) * 255.0f) + 0.5f), (int) ((AbstractC167007dF.A04(list, 2) * 255.0f) + 0.5f));
    }

    @Override // X.MQE
    public final String getName() {
        return "PreprocessServerEditing";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.AMM] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ll, com.instagram.common.session.UserSession] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // X.MQE
    public final Object F8t(OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        C47Z c47z = oxd.A0C;
        EnumC915447k enumC915447k = c47z.A1f;
        EnumC915447k enumC915447k2 = EnumC915447k.A07;
        if (enumC915447k == enumC915447k2 && c47z.A1G == EnumC40111tc.A0Q) {
            if (AbstractC210079Qv.A05(c47z)) {
                userSession = this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36327636548467443L;
            } else if (AbstractC210079Qv.A06(c47z)) {
                userSession = this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36327636548598517L;
            }
            if (!C18U.A06(c06090Tz, userSession, j) || !c47z.A14(ShareType.A02)) {
                c47z.A0T(EnumC40111tc.A0a);
                c47z.A4t.clear();
                c47z.A33 = null;
                C915547l c915547l = c47z.A1T;
                c915547l.A03 = 0;
                c915547l.A05 = 0L;
                return NRK.A00;
            }
        }
        ?? r6 = this.A01;
        if (C18U.A06(C06090Tz.A05, r6, 36327636548532980L) && c47z.A1f == enumC915447k2 && c47z.A1G == EnumC40111tc.A0a) {
            try {
                ?? r2 = AMM.A00;
                try {
                    if (r2.A03(r6, c47z)) {
                        C84823qW A01 = AMM.A01(c47z);
                        if (A01 != null) {
                            String str = A01.A1b;
                            c47z.A0T(EnumC40111tc.A0Q);
                            try {
                                String A02 = AbstractC15860qg.A02();
                                if (A02 != null) {
                                    Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                                    new Canvas(createBitmap).drawColor(0);
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(A02));
                                    try {
                                        C0fK.A02(Bitmap.CompressFormat.JPEG, createBitmap, bufferedOutputStream, 1);
                                        bufferedOutputStream.close();
                                        if (createBitmap != null) {
                                            createBitmap.recycle();
                                        }
                                        c47z.A33 = A02;
                                        java.util.Set set = c47z.A4t;
                                        AGS ags = new AGS(EnumC222909sV.A07, str);
                                        ags.A03 = true;
                                        ags.A0H = str;
                                        ags.A0J = ProductType.STORY.A00;
                                        Float valueOf = Float.valueOf(-1.0f);
                                        ags.A08 = valueOf;
                                        ags.A06 = valueOf;
                                        ags.A09 = valueOf;
                                        ags.A0A = valueOf;
                                        ags.A0F = -1;
                                        ags.A07 = valueOf;
                                        set.add(ags);
                                        int i = c47z.A0H;
                                        int i2 = c47z.A0G;
                                        c47z.A0S = i;
                                        c47z.A0R = i2;
                                        C915547l c915547l2 = c47z.A1T;
                                        c915547l2.A03 = 2;
                                        ClipInfo clipInfo = c47z.A1N;
                                        c915547l2.A05 = clipInfo.A05 - clipInfo.A07;
                                        return NRL.A00;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            C20I.A00(bufferedOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                }
                                throw new RuntimeException();
                            } catch (Throwable th3) {
                                AbstractC167007dF.A15(C18950wb.A01.AEp("PreprocessServerEditingStep", 817903929), DialogModule.KEY_MESSAGE, "create_bitmap_error", th3);
                                throw th3;
                            }
                        }
                        throw AbstractC166987dD.A12("Immersive mention reshare ReelInteractive is null");
                    }
                    if (r2.A04(r6, c47z)) {
                        C84823qW A022 = AMM.A02(c47z);
                        if (A022 != null) {
                            String str2 = A022.A1b;
                            c47z.A0T(EnumC40111tc.A0Q);
                            C1125256f A00 = AMM.A00(c47z);
                            if (A00 != null) {
                                List list = A00.A0V;
                                if (list != null) {
                                    List list2 = A00.A0Q;
                                    if (list2 != null) {
                                        boolean A1O = AbstractC167007dF.A1O((A00.A02 > 0.0f ? 1 : (A00.A02 == 0.0f ? 0 : -1)));
                                        r6 = 0;
                                        try {
                                            Context context = this.A00;
                                            String A023 = AbstractC15860qg.A02();
                                            if (A023 != null) {
                                                int i3 = AbstractC167007dF.A0K(context).widthPixels / 2;
                                                int A012 = C1H4.A01(i3 / 0.5625f);
                                                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, A012, A00(list), A00(list2), Shader.TileMode.CLAMP);
                                                Bitmap createBitmap2 = Bitmap.createBitmap(i3, A012, Bitmap.Config.ARGB_8888);
                                                try {
                                                    Canvas canvas = new Canvas(createBitmap2);
                                                    Paint A0S = AbstractC166987dD.A0S(5);
                                                    A0S.setShader(linearGradient);
                                                    canvas.drawPaint(A0S);
                                                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(A023));
                                                    try {
                                                        C0fK.A02(Bitmap.CompressFormat.JPEG, createBitmap2, bufferedOutputStream2, 90);
                                                        bufferedOutputStream2.close();
                                                        if (createBitmap2 != null) {
                                                            createBitmap2.recycle();
                                                        }
                                                        c47z.A33 = A023;
                                                        java.util.Set set2 = c47z.A4t;
                                                        AGS ags2 = new AGS(EnumC222909sV.A07, str2);
                                                        ClipInfo clipInfo2 = c47z.A1N;
                                                        ags2.A05 = Float.valueOf((clipInfo2.A05 - clipInfo2.A07) / 1000.0f);
                                                        ags2.A09 = Float.valueOf(A022.A03);
                                                        ags2.A0A = Float.valueOf(A022.A04);
                                                        ags2.A0F = Integer.valueOf(A022.A09);
                                                        ags2.A08 = Float.valueOf(A022.A02);
                                                        ags2.A06 = Float.valueOf(A022.A00);
                                                        ags2.A07 = Float.valueOf(A022.A01 * 360.0f);
                                                        ags2.A0J = ProductType.STORY.A00;
                                                        ags2.A03 = false;
                                                        ags2.A0H = str2;
                                                        ags2.A0D = Integer.valueOf(A022.A07);
                                                        ags2.A0M = A022.A1l;
                                                        ags2.A0C = 0;
                                                        ags2.A0B = 0;
                                                        ags2.A0E = 0;
                                                        ags2.A0L = EnumC75383a5.A0o.A00;
                                                        AGG agg = new AGG(null, null, Integer.valueOf((int) (r2.widthPixels / AbstractC167007dF.A0K(context).density)), null);
                                                        ags2.A01 = agg;
                                                        if (A1O) {
                                                            agg.A04 = "v2";
                                                        }
                                                        set2.add(ags2);
                                                        int i4 = c47z.A0H;
                                                        int i5 = c47z.A0G;
                                                        c47z.A0S = i4;
                                                        c47z.A0R = i5;
                                                        C915547l c915547l3 = c47z.A1T;
                                                        c915547l3.A03 = 2;
                                                        ClipInfo clipInfo3 = c47z.A1N;
                                                        c915547l3.A05 = clipInfo3.A05 - clipInfo3.A07;
                                                        return NRL.A00;
                                                    } finally {
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    r6 = createBitmap2;
                                                    AbstractC167007dF.A15(C18950wb.A01.AEp("PreprocessServerEditingStep", 817903929), DialogModule.KEY_MESSAGE, "create_bitmap_error", th);
                                                    throw th;
                                                }
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } else {
                                        throw AbstractC166987dD.A12("bottomColors of background gradient is null");
                                    }
                                } else {
                                    throw AbstractC166987dD.A12("topColors of background gradient is null");
                                }
                            } else {
                                throw AbstractC166987dD.A12("background gradient is null");
                            }
                        } else {
                            throw AbstractC166987dD.A12("Non-immersive mention reshare ReelInteractive is null");
                        }
                    }
                } catch (Throwable th6) {
                    if (r6 != 0) {
                        r6.recycle();
                        throw th6;
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
                InterfaceC70363Du interfaceC70363Du = oxd.A0D;
                EnumC115415Kb enumC115415Kb = EnumC115415Kb.A0D;
                interfaceC70363Du.EHh(enumC115415Kb, c47z, "failed_to_preprocess_server_editing", "UnknownException", th7);
                return new NRJ(C115445Ke.A01(enumC115415Kb, "failed_to_preprocess_server_editing", null, th7));
            }
            InterfaceC70363Du interfaceC70363Du2 = oxd.A0D;
            EnumC115415Kb enumC115415Kb2 = EnumC115415Kb.A0D;
            interfaceC70363Du2.EHh(enumC115415Kb2, c47z, "failed_to_preprocess_server_editing", "UnknownException", th7);
            return new NRJ(C115445Ke.A01(enumC115415Kb2, "failed_to_preprocess_server_editing", null, th7));
        }
        return NRK.A00;
    }

    public AkX(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
