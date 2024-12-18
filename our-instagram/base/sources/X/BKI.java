package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.endtoend.EndToEnd;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BKI implements InterfaceC65452xh, InterfaceC170847jb {
    public C2Z5 A00;
    public boolean A01;
    public final LayoutInflater A02;
    public final C170937jk A03;
    public final ClipsViewerConfig A04;
    public final BKG A05;
    public final UserSession A06;
    public final AbstractC37552Gg8 A07;
    public final C9IA A08;
    public final BKJ A09;
    public final C1337362e A0A;
    public final C25359BKc A0B;
    public final HashMap A0C;
    public final Map A0D;
    public final InterfaceC16660sJ A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final InterfaceC66382zF A0H;
    public final C9I9 A0I;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.BDD, X.9I9] */
    public BKI(Context context, C2Z5 c2z5, ClipsViewerConfig clipsViewerConfig, BKG bkg, InterfaceC66382zF interfaceC66382zF, UserSession userSession, AbstractC37552Gg8 abstractC37552Gg8, final C65835Tus c65835Tus, C1337362e c1337362e, C25359BKc c25359BKc, Map map, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(map, 11);
        this.A06 = userSession;
        this.A0B = c25359BKc;
        this.A07 = abstractC37552Gg8;
        this.A04 = clipsViewerConfig;
        this.A0A = c1337362e;
        this.A05 = bkg;
        this.A0F = z;
        this.A00 = c2z5;
        this.A0D = map;
        this.A0E = interfaceC16660sJ;
        this.A0H = interfaceC66382zF;
        this.A02 = LayoutInflater.from(context);
        this.A0C = AbstractC166987dD.A1G();
        this.A01 = true;
        final C2XE c2xe = new C2XE(context);
        ?? r2 = new BDD(c2xe, c65835Tus) { // from class: X.9I9
            public int A00;
            public int A01;
            public int A02;
            public int A03;
            public final C2XE A04;
            public final C65835Tus A05;

            @Override // X.BDD
            public final void E5a(C124005jE c124005jE) {
                C14360o3.A0B(c124005jE, 0);
                A00();
                c124005jE.A06(this.A04, null, this.A03, this.A01);
            }

            @Override // X.BDD
            public final void E5q(C2Vj c2Vj, C124005jE c124005jE) {
                C14360o3.A0B(c124005jE, 0);
                A00();
                c124005jE.A07(this.A04, null, this.A03, this.A01);
            }

            private final void A00() {
                C65835Tus c65835Tus2 = this.A05;
                int i = c65835Tus2.A01;
                if (i != this.A02) {
                    this.A02 = i;
                    int i2 = AbstractC75953b0.A00;
                    this.A03 = View.MeasureSpec.makeMeasureSpec(i, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                }
                int i3 = c65835Tus2.A00;
                if (i3 != this.A00) {
                    this.A00 = i3;
                    int i4 = AbstractC75953b0.A00;
                    this.A01 = View.MeasureSpec.makeMeasureSpec(i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                }
            }

            @Override // X.BDD
            public final C124005jE ALB(C170697jM c170697jM) {
                return new C124005jE(null, this.A04.A02.A01, null, c170697jM, false);
            }

            {
                this.A04 = c2xe;
                this.A05 = c65835Tus;
                int i = c65835Tus.A01;
                this.A02 = i;
                this.A00 = c65835Tus.A00;
                int i2 = AbstractC75953b0.A00;
                this.A03 = View.MeasureSpec.makeMeasureSpec(i, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                this.A01 = View.MeasureSpec.makeMeasureSpec(this.A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            }
        };
        this.A0I = r2;
        C9IA c9ia = new C9IA();
        this.A08 = c9ia;
        C170937jk c170937jk = new C170937jk(c9ia, r2);
        c170937jk.A05 = true;
        this.A03 = c170937jk;
        this.A09 = new BKJ(this);
        this.A0G = C18U.A06(C06090Tz.A05, userSession, 36322856250190525L);
    }

    @Override // X.InterfaceC65452xh
    public final void D2j(int i, int i2, Object obj) {
        C25362BKf c25362BKf = new C25362BKf((Object) this, i, i2, 3);
        if (this.A01) {
            c25362BKf.invoke();
        }
    }

    @Override // X.InterfaceC170847jb
    public final void D9I(boolean z, long j) {
    }

    @Override // X.InterfaceC65452xh
    public final void DMJ(int i, int i2) {
        C25362BKf c25362BKf = new C25362BKf(this, i, i2, 4);
        if (this.A01) {
            c25362BKf.invoke();
        }
    }

    @Override // X.InterfaceC65452xh
    public final void DTy(int i, int i2) {
        C25362BKf c25362BKf = new C25362BKf(this, i, i2, 5);
        if (this.A01) {
            c25362BKf.invoke();
        }
    }

    @Override // X.InterfaceC65452xh
    public final void DfC(int i, int i2) {
        C25362BKf c25362BKf = new C25362BKf(this, i, i2, 6);
        if (this.A01) {
            c25362BKf.invoke();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0113, code lost:
    
        if (X.AbstractC41071vF.A0P(null, r8) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0119, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x011f, code lost:
    
        if (r8.A5v() == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0121, code lost:
    
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0123, code lost:
    
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x012d, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0133, code lost:
    
        if (X.C76253bV.A00(r4, r2) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0135, code lost:
    
        r23 = X.EnumC25466BOf.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x014d, code lost:
    
        if (r8 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0153, code lost:
    
        if (r8.A58() == true) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0159, code lost:
    
        if (r8.A5t() != true) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x015b, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0160, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0166, code lost:
    
        if (r4.CdW() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0168, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x016e, code lost:
    
        if (r4.CdW() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0170, code lost:
    
        if (r17 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0172, code lost:
    
        if (r22 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0174, code lost:
    
        if (r18 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0176, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0183, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36326064590501482L) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x018b, code lost:
    
        if (r4.CdW() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x018d, code lost:
    
        if (r17 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x018f, code lost:
    
        if (r22 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0191, code lost:
    
        if (r18 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0193, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x01a0, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36326064590960241L) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01a4, code lost:
    
        r18 = X.C25376BKt.A00;
        r1 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01a8, code lost:
    
        if (r1 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01aa, code lost:
    
        r7 = r1.A2E(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01ae, code lost:
    
        r1 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x01b9, code lost:
    
        if (X.C18U.A06(r1, r2, 36323221322083415L) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01bb, code lost:
    
        r10 = r4.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01bd, code lost:
    
        if (r10 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01c3, code lost:
    
        if (r10.Axm() != true) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x01c6, code lost:
    
        if (r31 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01c8, code lost:
    
        if (r22 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01ca, code lost:
    
        if (r7 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01d0, code lost:
    
        if (r7.A2N() != true) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01d3, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01d8, code lost:
    
        if (r8 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x01da, code lost:
    
        r10 = r8.A0C.getClipsMetadata();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01e0, code lost:
    
        if (r10 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01e2, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01e8, code lost:
    
        if (r10.AZi() != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x01ee, code lost:
    
        if (r9 != com.instagram.clips.intf.ClipsViewerSource.A21) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x01f9, code lost:
    
        if (X.C18U.A06(r1, r2, 36318561282955581L) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01ff, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0201, code lost:
    
        if (r7 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0203, code lost:
    
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0209, code lost:
    
        if (r7.isVerified() == true) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x020d, code lost:
    
        if (r21 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x020f, code lost:
    
        if (r20 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0211, code lost:
    
        if (r19 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0217, code lost:
    
        r27 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x021d, code lost:
    
        if (r4.A0G() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x021f, code lost:
    
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0221, code lost:
    
        if (r8 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0227, code lost:
    
        if (r8.A58() != true) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x022d, code lost:
    
        if (r8.A5t() != true) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x022f, code lost:
    
        r30 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0231, code lost:
    
        if (r31 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x023b, code lost:
    
        if (r4.A06().A0Z == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x023d, code lost:
    
        r7 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x023f, code lost:
    
        if (r7 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0241, code lost:
    
        r7 = r7.A0C.getInjected();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0247, code lost:
    
        if (r7 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0249, code lost:
    
        r7 = r7.AZB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x024d, code lost:
    
        if (r7 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x024f, code lost:
    
        r7 = r7.getTitle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0253, code lost:
    
        if (r7 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0259, code lost:
    
        if (r7.length() <= 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x025c, code lost:
    
        r32 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0261, code lost:
    
        r7 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0263, code lost:
    
        if (r7 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0265, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x026d, code lost:
    
        if (r7.A0C.Ap5() != null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0271, code lost:
    
        X.C14360o3.A0B(r2, 0);
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x027f, code lost:
    
        if (X.C18U.A06(r1, r2, 36323972941426425L) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0281, code lost:
    
        r1 = X.AbstractC87103uT.A00(com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.A05, X.AbstractC41071vF.A02(r2, r4.A02));
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x028d, code lost:
    
        if (r1 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x028f, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0294, code lost:
    
        if (r1.length() > 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0297, code lost:
    
        r1 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0299, code lost:
    
        if (r1 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x029b, code lost:
    
        r1 = r1.A0C.getInjected();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x02a1, code lost:
    
        if (r1 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02a3, code lost:
    
        r1 = r1.BeI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x02a7, code lost:
    
        if (r1 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02a9, code lost:
    
        r1 = r1.AjQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02ad, code lost:
    
        if (r1 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02b3, code lost:
    
        if (r1.length() <= 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02b5, code lost:
    
        r1 = r4.A02;
        r39 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02b9, code lost:
    
        if (r1 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x02bb, code lost:
    
        r1 = r1.A0C.getInjected();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02c1, code lost:
    
        if (r1 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x02c3, code lost:
    
        r1 = r1.AZB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02c7, code lost:
    
        if (r1 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02c9, code lost:
    
        r1 = r1.getTitle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02cd, code lost:
    
        if (r1 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x02d3, code lost:
    
        if (r1.length() <= 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02d5, code lost:
    
        r1 = r4.A02;
        r41 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x02d9, code lost:
    
        if (r1 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x02db, code lost:
    
        r10 = r1.A0C.BUx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x02e1, code lost:
    
        if (r10 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x02e7, code lost:
    
        if (r10.B7j() == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x02e9, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x02f5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r2, 36321803983136595L) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0305, code lost:
    
        if (r10.AtW() == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0307, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0313, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r2, 36321803983202132L) != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0316, code lost:
    
        if (r9 != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0318, code lost:
    
        if (r1 == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x031a, code lost:
    
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0315, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0300, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x031c, code lost:
    
        r7 = new X.C25377BKu(r23, r24, r25, r26, r27, false, false, r30, r31, r32, true, false, false, false, r37, r38, r39, true, r41, !X.C25376BKt.A03(r4, r2, r18), false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x02f8, code lost:
    
        r39 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x02fb, code lost:
    
        if (r7 != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x02fd, code lost:
    
        r38 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0296, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x026f, code lost:
    
        r37 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x025f, code lost:
    
        r32 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0233, code lost:
    
        r30 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0215, code lost:
    
        if (r9 != com.instagram.clips.intf.ClipsViewerSource.A0s) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x020b, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x01fb, code lost:
    
        r25 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x01fd, code lost:
    
        if (r17 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x01ea, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x01d6, code lost:
    
        r24 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x01a2, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0185, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x015e, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0138, code lost:
    
        r1 = r4.A06().A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0140, code lost:
    
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0146, code lost:
    
        if (r1.isEmpty() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0148, code lost:
    
        r23 = X.EnumC25466BOf.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x014b, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0125, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x012b, code lost:
    
        if (r8.A5w() == true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0117, code lost:
    
        if (r8 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0d00, code lost:
    
        if (r1 == null) goto L440;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0652 A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0662 A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0371 A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0688 A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b5a A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0b79 A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b94 A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0722 A[Catch: Exception -> 0x0c2c, TryCatch #1 {Exception -> 0x0c2c, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x002e, B:6:0x0031, B:7:0x0038, B:9:0x0039, B:10:0x0648, B:12:0x0652, B:13:0x0656, B:17:0x0674, B:19:0x0688, B:21:0x069e, B:23:0x06c6, B:24:0x0714, B:26:0x0ad5, B:28:0x0adb, B:29:0x0aeb, B:31:0x0af4, B:33:0x0af8, B:34:0x0afe, B:37:0x0b01, B:39:0x0b04, B:44:0x0c14, B:45:0x0c15, B:47:0x0c24, B:50:0x0b15, B:56:0x0b23, B:60:0x0722, B:62:0x0729, B:63:0x076d, B:65:0x0773, B:67:0x0789, B:69:0x07b1, B:71:0x07da, B:72:0x07de, B:74:0x082b, B:76:0x0832, B:78:0x083e, B:79:0x0872, B:80:0x0876, B:82:0x087c, B:83:0x087e, B:85:0x0886, B:86:0x088e, B:88:0x0896, B:90:0x08ae, B:92:0x08ca, B:94:0x08da, B:96:0x0900, B:98:0x094b, B:100:0x0952, B:101:0x0961, B:103:0x0969, B:105:0x097f, B:107:0x09a5, B:108:0x09f2, B:110:0x09f9, B:111:0x0a08, B:113:0x0a0f, B:114:0x0a20, B:116:0x0a27, B:117:0x0a60, B:119:0x0a68, B:121:0x0a72, B:123:0x0a7e, B:125:0x0aa9, B:127:0x0ab1, B:128:0x0ac0, B:130:0x0ac4, B:132:0x0aca, B:133:0x0b2c, B:135:0x0662, B:139:0x066e, B:142:0x0057, B:144:0x006a, B:146:0x0070, B:147:0x00a7, B:149:0x00af, B:151:0x00c3, B:153:0x00d7, B:155:0x00eb, B:158:0x0343, B:160:0x0371, B:161:0x0373, B:164:0x00fe, B:166:0x010d, B:168:0x0119, B:173:0x012f, B:175:0x0135, B:177:0x014f, B:179:0x0155, B:182:0x0160, B:185:0x016a, B:190:0x0176, B:192:0x0187, B:197:0x0193, B:199:0x01a4, B:201:0x01aa, B:202:0x01ae, B:204:0x01bb, B:206:0x01bf, B:212:0x01cc, B:217:0x01da, B:219:0x01e2, B:221:0x01ec, B:223:0x01f0, B:227:0x0203, B:232:0x0217, B:236:0x0223, B:238:0x0229, B:242:0x0235, B:244:0x023d, B:246:0x0241, B:248:0x0249, B:250:0x024f, B:252:0x0255, B:256:0x0261, B:258:0x0265, B:260:0x0271, B:262:0x0281, B:264:0x028f, B:266:0x0297, B:268:0x029b, B:270:0x02a3, B:272:0x02a9, B:274:0x02af, B:276:0x02b5, B:278:0x02bb, B:280:0x02c3, B:282:0x02c9, B:284:0x02cf, B:286:0x02d5, B:288:0x02db, B:290:0x02e3, B:292:0x02e9, B:295:0x0301, B:297:0x0307, B:304:0x031c, B:312:0x0213, B:322:0x0138, B:324:0x0142, B:326:0x0148, B:328:0x0125, B:334:0x03c5, B:335:0x03cc, B:337:0x03dd, B:339:0x03e5, B:340:0x03e7, B:342:0x0427, B:345:0x0435, B:346:0x063d, B:350:0x047d, B:352:0x0474, B:354:0x0484, B:356:0x04a2, B:357:0x04a4, B:359:0x04e4, B:362:0x04f2, B:364:0x051e, B:366:0x0522, B:367:0x054f, B:369:0x0555, B:389:0x055d, B:371:0x0562, B:373:0x057e, B:374:0x05b9, B:376:0x05c1, B:378:0x05c5, B:379:0x05cb, B:384:0x05ed, B:387:0x05d5, B:391:0x05fc, B:393:0x0604, B:394:0x0608, B:395:0x0617, B:396:0x05f9, B:399:0x062c, B:400:0x0643, B:401:0x0b35, B:403:0x0b3c, B:405:0x0b42, B:406:0x0b44, B:408:0x0b4c, B:409:0x0b50, B:410:0x0b56, B:412:0x0b5a, B:413:0x0b5f, B:415:0x0b79, B:416:0x0b86, B:418:0x0b94, B:420:0x0b98, B:421:0x0b9e, B:423:0x0ba2, B:424:0x0ba8, B:426:0x0bac, B:427:0x0bb2, B:429:0x0bb6, B:430:0x0bf7, B:433:0x0bbe, B:434:0x0bc0, B:436:0x0bc8, B:438:0x0bd0, B:440:0x0bda, B:36:0x0aff, B:40:0x0b05, B:42:0x0b09), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r3v108, types: [java.lang.Object, X.7jK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC170707jN A00(X.BKI r52, int r53) {
        /*
            Method dump skipped, instructions count: 3412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKI.A00(X.BKI, int):X.7jN");
    }

    @Override // X.InterfaceC170847jb
    public final void D9D() {
        this.A0H.DxB();
    }

    public static final void A01(BKI bki) {
        C2Z5 c2z5;
        if (EndToEnd.isRunningEndToEndTest() && (c2z5 = bki.A00) != null && c2z5.getItemCount() > 0) {
            bki.D2j(c2z5.getItemCount() - 1, 1, null);
        }
    }
}
