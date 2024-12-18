package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Rational;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.B1a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24927B1a implements Callable, InterfaceC58147PqC {
    public final Context A00;
    public final Bitmap A01;
    public final UserSession A02;
    public final InterfaceC25181BCe A03;
    public final C22925A8v A04;
    public final FilterGroupModel A05;
    public final C183978Ee A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.InterfaceC58147PqC
    public final /* synthetic */ void DfF() {
    }

    @Override // X.InterfaceC58147PqC
    public final void DfI(List list) {
        RunnableC24773Axv runnableC24773Axv;
        C14360o3.A0B(list, 0);
        boolean z = false;
        if (list.isEmpty()) {
            runnableC24773Axv = new RunnableC24773Axv(this, null, false);
        } else {
            C54791OJj c54791OJj = (C54791OJj) list.get(0);
            if (c54791OJj.A07 == C05F.A00) {
                z = true;
            }
            runnableC24773Axv = new RunnableC24773Axv(this, c54791OJj.A08, z);
        }
        C11T.A02(runnableC24773Axv);
    }

    @Override // X.InterfaceC58147PqC
    public final /* synthetic */ void DfK() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        if (X.C8Li.A02(r8) == false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, X.7wv, X.AVn] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r30 = this;
            r12 = r30
            com.instagram.common.session.UserSession r8 = r12.A02
            java.lang.String r0 = "Required value was null."
            if (r8 == 0) goto Lca
            android.graphics.Bitmap r2 = r12.A01
            if (r2 == 0) goto L2e
            int r0 = r2.getWidth()
            float r3 = (float) r0
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            r1 = 1
            java.io.File r0 = X.AbstractC917048o.A00()
            X.AHW.A02(r2, r0, r1)
            X.C14360o3.A07(r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r12.A05
            java.lang.String r2 = r0.getAbsolutePath()
            r4 = 0
            r5 = r4
            r6 = r4
            X.AbstractC197358o6.A04(r1, r2, r3, r4, r5, r6)
        L2e:
            X.8Ee r0 = r12.A06
            android.content.Context r6 = r12.A00
            X.8nn r15 = X.AbstractC197158nl.A00(r6, r0)
            int r4 = r0.A07
            int r5 = r0.A09
            int r3 = r0.A06
            android.graphics.Rect r21 = r0.A00()
            X.A8v r11 = r12.A04
            r20 = 1
            int r1 = r11.A01
            float r2 = (float) r1
            int r1 = r11.A00
            float r1 = (float) r1
            float r2 = r2 / r1
            r22 = r2
            r23 = r5
            r24 = r3
            r25 = r4
            r26 = r20
            com.instagram.creation.base.CropInfo r9 = X.AbstractC197188no.A00(r21, r22, r23, r24, r25, r26)
            X.AVn r13 = new X.AVn
            r13.<init>()
            r10 = 0
            r1 = 0
            X.7w0 r23 = new X.7w0
            r23.<init>()
            r2 = 355(0x163, float:4.97E-43)
            java.lang.String r26 = X.MSV.A00(r2)
            r21 = r6
            r22 = r13
            r24 = r8
            r25 = r10
            r27 = r10
            r28 = r1
            r29 = r1
            X.7wV r7 = X.AbstractC23039ADv.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r2 = r15.Cev()
            if (r2 == 0) goto L8b
            boolean r2 = X.C8Li.A02(r8)
            r26 = 1
            if (r2 != 0) goto L8d
        L8b:
            r26 = 0
        L8d:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r14 = r12.A05
            java.lang.Integer r16 = X.C05F.A01
            boolean r2 = r12.A08
            if (r2 == 0) goto Lc7
            X.NeT r2 = X.EnumC53116NeT.A02
        L97:
            X.NeT[] r17 = new X.EnumC53116NeT[]{r2}
            int r3 = r0.A01
            boolean r2 = r0.A14
            boolean r0 = r12.A07
            X.OK0 r5 = new X.OK0
            r21 = r1
            r22 = r2
            r23 = r20
            r24 = r1
            r25 = r0
            r27 = r1
            r18 = r4
            r19 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r5.A00()
            if (r0 != 0) goto Lc4
            X.Axv r0 = new X.Axv
            r0.<init>(r12, r10, r1)
            X.C11T.A02(r0)
        Lc4:
            X.0eB r0 = X.C0eB.A00
            return r0
        Lc7:
            X.NeT r2 = X.EnumC53116NeT.A03
            goto L97
        Lca:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC24927B1a.call():java.lang.Object");
    }

    public CallableC24927B1a(Context context, Bitmap bitmap, UserSession userSession, InterfaceC25181BCe interfaceC25181BCe, C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C183978Ee c183978Ee, boolean z, boolean z2, boolean z3) {
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = c183978Ee;
        this.A01 = bitmap;
        this.A04 = c22925A8v;
        this.A08 = z;
        this.A03 = interfaceC25181BCe;
        this.A09 = z2;
        this.A07 = z3;
        this.A05 = filterGroupModel.E3K();
    }

    @Override // X.InterfaceC58147PqC
    public final void DiC(Map map) {
        String str;
        boolean z = false;
        if (map.isEmpty()) {
            str = null;
        } else {
            C54791OJj c54791OJj = (C54791OJj) AbstractC166997dE.A16(map).next();
            str = c54791OJj.A08;
            if (this.A09) {
                if (this.A02 != null) {
                    C183978Ee c183978Ee = this.A06;
                    int i = AbstractC188508Wp.A03;
                    try {
                        C60782q2 c60782q2 = new C60782q2(str);
                        Float f = c183978Ee.A0O;
                        if (f != null) {
                            c60782q2.A0P("FNumber", String.valueOf(f));
                        }
                        Long l = c183978Ee.A0W;
                        if (l != null) {
                            c60782q2.A0P("ExposureTime", String.valueOf(Float.valueOf(((float) l.longValue()) / 1.0E9f)));
                        }
                        long j = c183978Ee.A0B;
                        if (j <= 0) {
                            j = c183978Ee.A0A;
                        }
                        if (j > 0) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                            long j2 = c183978Ee.A0B;
                            if (j2 <= 0) {
                                j2 = c183978Ee.A0A;
                            }
                            c60782q2.A0P("DateTime", String.valueOf(simpleDateFormat.format(Long.valueOf(j2))));
                        }
                        Integer num = c183978Ee.A0T;
                        if (num != null) {
                            c60782q2.A0P("PhotographicSensitivity", String.valueOf(num));
                        }
                        Float f2 = c183978Ee.A0P;
                        if (f2 != null) {
                            c60782q2.A0P("FocalLength", new Rational(AbstractC166987dD.A0A(f2.floatValue(), 100.0f), 100).toString());
                        }
                        Integer num2 = c183978Ee.A0Q;
                        if (num2 != null) {
                            c60782q2.A0P("WhiteBalance", String.valueOf(num2));
                        }
                        List list = c183978Ee.A0p;
                        if (list != null && AbstractC166987dD.A1b(list)) {
                            C62919SXb.A00.A00(c60782q2);
                        }
                        String A05 = c183978Ee.A05();
                        if (A05 != null) {
                            c60782q2.A0P("UserComment", AbstractC13670mt.A06("%s%s", "eId:", A05));
                        }
                        c60782q2.A0O();
                    } catch (IOException e) {
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "error setting exif metadata";
                        }
                        AbstractC12120kG.A01("GalleryMetadataUtil", localizedMessage);
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                AbstractC54108Nw6.A00(this.A00, str, "image");
            }
            if (c54791OJj.A07 == C05F.A00) {
                z = true;
            }
        }
        C11T.A02(new RunnableC24774Axw(this, str, z));
    }
}
