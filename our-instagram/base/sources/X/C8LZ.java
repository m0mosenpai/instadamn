package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.ui.text.TextColorScheme;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8LZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LZ implements InterfaceC11380iw, C7W5, InterfaceC1821886c {
    public static final String __redex_internal_original_name = "PhotoViewController";
    public int A00;
    public int A01;
    public CropInfo A02;
    public FilterGroupModel A03;
    public A8T A04;
    public TextColorScheme A05;
    public Runnable A06;
    public Runnable A07;
    public boolean A09;
    public final Activity A0A;
    public final ViewGroup A0B;
    public final UserSession A0D;
    public final C81N A0E;
    public final C8LJ A0F;
    public final C183688Ct A0G;
    public final TargetViewSizeProvider A0H;
    public final AnonymousClass840 A0I;
    public final C81J A0J;
    public final C1820485o A0K;
    public final InterfaceC185638Lg A0L;
    public final C185698Lo A0M;
    public final C185768Lv A0N;
    public final C185738Ls A0O;
    public final C8MR A0Q;
    public final C8LC A0R;
    public final C8DL A0S;
    public final C89E A0T;
    public final C8LT A0U;
    public final C150286pc A0V;
    public final C8MP A0W;
    public final C183608Cl A0X;
    public final ViewOnTouchListenerC1829389o A0Y;
    public final C8MD A0Z;
    public final C8MJ A0a;
    public final C8M1 A0b;
    public final C8MQ A0c;
    public final AnonymousClass878 A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final InterfaceC08830cm A0i;
    public final InterfaceC08830cm A0j;
    public final InterfaceC09390do A0k;
    public final InterfaceC09390do A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final C1819485e A0p;
    public final C8HI A0q;
    public final InterfaceC1810081c A0r;
    public final C87P A0s;
    public final AnonymousClass856 A0t;
    public final AnonymousClass825 A0u;
    public final C185728Lr A0v;
    public final C8LM A0w;
    public final InterfaceC185628Le A0x;
    public final C8ML A0y;
    public final C8MH A0z;
    public final C8MM A10;
    public final InterfaceC1810781j A11;
    public final C41761wQ A0C = C41761wQ.A00();
    public boolean A08 = false;
    public final InterfaceC185598Lb A0P = new InterfaceC185598Lb() { // from class: X.8La
        @Override // X.InterfaceC185598Lb
        public final void DSG(A5Y a5y, ACA aca) {
            C8LZ c8lz = C8LZ.this;
            AH3 A00 = AH3.A00(aca);
            Integer num = C05F.A0C;
            c8lz.A0U.A03(c8lz, a5y, A00, num, AbstractC09440dt.A01(new B3P(null, c8lz, A00, num)), true, false);
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r29 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (A0E(r22) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r4 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r0 = r22.A0N.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r0.A09 = false;
        r0.A0K.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r8 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r12 = r22.A0F(r21, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r12 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append("mediaBitmap is null, postCaptureAREffect==null?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r8 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        r4.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r4.append(", postCaptureAREffect.getId()=");
        r4.append(r8.A0K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        X.AbstractC12120kG.A01(X.C8LZ.__redex_internal_original_name, r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        r4 = r22.A0W;
        r0 = r22.A03;
        r0.getClass();
        r13 = ((com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0).A02;
        r19 = X.AbstractC226699zR.A00(r22.A0I.A02.A01.A0Y);
        r3 = r4.A05;
        r10 = new com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$1(r21, r12, r13, r23, r24, r4, r27, null, r19, r28, false);
        X.AbstractC23641Du.A03(X.C05F.A00, X.AnonymousClass191.A00, r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r7 = r22.A0A;
        r5 = r27.A09;
        r4 = r27.A06;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if ((r27.A07 % 180) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        r0 = X.ALe.A03(r7, r22.A0D, r5, r4, r16, X.AbstractC176977tt.A00(r7));
        r12 = X.C1NC.A0G(r27.A06(), r27.A09, r27.A06, r0.x, r0.y, r27.A07, r27.A14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        if (r5 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        r1 = r22.A0A;
        r0 = r22.A0E.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        r7 = r0.getBitmap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        r7.getClass();
        r5 = new X.PUP(r1, r7, r21, r26, true, r28);
        r1 = 473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        X.C1GJ.A03(new X.C121275eQ(r5, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0116, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        r3 = r22.A0I.A02;
        r4 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
    
        if (r4.A03() == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
    
        if (r4.A03().A13 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
    
        if (r3.A01() != X.EnumC198268pb.A04) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
    
        r0 = r4.A0Y;
        r0.getClass();
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        if (((java.util.Set) r0.A09.A00).contains(X.C81W.A0C) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014a, code lost:
    
        r5 = r22.A0A;
        r4 = r22.A0D;
        r3 = r22.A03;
        r3.getClass();
        r10 = r22.A0v.A00();
        X.C14360o3.A0B(r5, 0);
        r6 = r5.getApplicationContext();
        X.C14360o3.A07(r6);
        r5 = new X.CallableC24927B1a(r6, r21, r4, r25, r10, r3, r27, r28, r14, r30);
        r1 = 472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0038, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0029, code lost:
    
        if (r8 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r8.A0L() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r8.A0L() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(android.graphics.Bitmap r21, X.C8LZ r22, X.C198998qz r23, X.InterfaceC25207BDf r24, X.InterfaceC25181BCe r25, X.InterfaceC57938Pmi r26, X.C183978Ee r27, boolean r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LZ.A04(android.graphics.Bitmap, X.8LZ, X.8qz, X.BDf, X.BCe, X.Pmi, X.8Ee, boolean, boolean, boolean):void");
    }

    public static void A0A(C8LZ c8lz, ACA aca, C9ZH c9zh, C9ZL c9zl, Boolean bool, String str, String str2) {
        A08(c8lz, null, aca, c9zh, null, null, null, c9zl, bool, C05F.A00, str, null, str2, null, null, null, 1, false, false);
    }

    public static Bitmap A00(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, C8LZ c8lz) {
        if (bitmap2 != null || bitmap3 != null) {
            Canvas canvas = new Canvas(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C81N c81n = c8lz.A0E;
            int width2 = c81n.A05().getWidth();
            int height2 = c81n.A05().getHeight();
            if (bitmap3 != null) {
                float width3 = (bitmap3.getWidth() * 1.0f) / width2;
                float height3 = (bitmap3.getHeight() * 1.0f) / height2;
                canvas.scale(1.0f / width3, 1.0f / height3);
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                canvas.scale(width3, height3);
            }
            if (width != width2 || height != height2) {
                canvas.scale(width / width2, height / height2);
            }
            if (bitmap2 != null) {
                if (bitmap2.isRecycled()) {
                    AbstractC12120kG.A01("PhotoViewController#getMediaScreenshotInternal_decorBitmap_is_null", "DecorBitmap should not be recycled");
                } else {
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
            }
        }
        return C1NC.A04(bitmap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC24481Hr A01(X.C8LZ r5) {
        /*
            X.8Ct r0 = r5.A0G
            X.6pc r0 = r0.A1h
            java.lang.Object r1 = r0.get()
            X.8NW r1 = (X.C8NW) r1
            java.lang.Class<X.8je> r0 = X.C194788je.class
            android.graphics.drawable.Drawable r0 = X.C8NW.A03(r1, r0)
            X.8je r0 = (X.C194788je) r0
            if (r0 == 0) goto L1f
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = r0.A01
            java.lang.String r0 = r0.A02
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r4 = 0
            if (r0 == 0) goto L3d
            X.8LJ r0 = r5.A0F
            X.82K r0 = r0.A00
            X.82M r1 = r0.A00()
            X.8LK r1 = (X.C8LK) r1
            r3 = 1
            r0 = 0
            android.graphics.Bitmap r2 = r1.A02(r0, r3)
            if (r2 == 0) goto L3d
            com.instagram.common.session.UserSession r1 = r5.A0D
            android.app.Activity r0 = r5.A0A
            X.1Hr r4 = X.AHW.A01(r0, r2, r1, r3)
        L3d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LZ.A01(X.8LZ):X.1Hr");
    }

    public static C3o9 A02(C8LZ c8lz, ACA aca) {
        C81663kb C76;
        DirectShareTarget directShareTarget = aca.A00;
        if (directShareTarget != null) {
            Object obj = directShareTarget.A09;
            obj.getClass();
            if (!(obj instanceof MsysThreadId)) {
                if (obj instanceof C163787Us) {
                    obj = ((C163787Us) obj).A01;
                } else if ((obj instanceof C83693oE) && (C76 = AbstractC28761aE.A00(c8lz.A0D).C76(((C83693oE) obj).A00)) != null) {
                    return C76.BKb();
                }
            }
            return (MsysThreadId) obj;
        }
        return null;
    }

    private void A03() {
        if (this.A0r.Cap()) {
            C150286pc c150286pc = this.A0G.A1h;
            if (c150286pc.A03 && ((C8NW) c150286pc.get()).A1R()) {
                return;
            }
        }
        C87P c87p = this.A0s;
        c87p.A00 = 0;
        c87p.A02 = -1L;
        c87p.A03 = false;
        c87p.A01 = 5000;
    }

    public static void A05(C8LZ c8lz) {
        C81N c81n = c8lz.A0E;
        if (c81n.A05().getParent() != null) {
            c81n.A05().setVisibility(8);
            c8lz.A0B.removeView(c81n.A05());
        }
    }

    public static void A06(C8LZ c8lz) {
        C8LM c8lm = c8lz.A0w;
        if (c8lm != null) {
            InterfaceC09390do interfaceC09390do = c8lm.A00;
            if (((C8MN) interfaceC09390do.getValue()).A04) {
                C8MN c8mn = (C8MN) interfaceC09390do.getValue();
                if (c8mn.A04) {
                    C55982hj c55982hj = c8mn.A06;
                    c55982hj.A08(c55982hj.A01, true);
                }
                c8lz.A0a.Da9();
            }
        }
    }

    public static void A07(C8LZ c8lz) {
        c8lz.A0B.removeCallbacks(c8lz.A07);
        c8lz.A07 = null;
        AnonymousClass878 anonymousClass878 = c8lz.A0d;
        anonymousClass878.release();
        anonymousClass878.A00 = false;
        c8lz.A03();
        C185768Lv c185768Lv = c8lz.A0N;
        C11T.A00();
        C197208nr c197208nr = c185768Lv.A02;
        if (c197208nr != null) {
            c197208nr.A09 = false;
            C197268nx c197268nx = c197208nr.A0K;
            c197268nx.A03 = false;
            c197268nx.A00();
            c185768Lv.A02 = null;
        }
        c185768Lv.A0B.clear();
        Map map = c185768Lv.A0C;
        for (Object obj : map.values()) {
            C81N c81n = c185768Lv.A06;
            C14360o3.A0B(obj, 0);
            c81n.A0E.A00.remove(obj);
        }
        map.clear();
        c185768Lv.A0A.clear();
        C178577wV c178577wV = c185768Lv.A01;
        if (c178577wV != null) {
            c178577wV.A04();
        }
        A05(c8lz);
    }

    public static void A09(C8LZ c8lz, A5Y a5y, AH3 ah3, Integer num, InterfaceC09390do interfaceC09390do, boolean z, boolean z2) {
        C23031Ai A00 = AbstractC23021Ah.A00(c8lz.A0D);
        A00.A4u.Egi(A00, true, C23031Ai.A8c[127]);
        c8lz.A0t.A00().A00();
        c8lz.A0U.A03(c8lz, a5y, ah3, num, interfaceC09390do, z, z2);
        if (z) {
            c8lz.A0r.E4u(new Object());
        }
    }

    public static void A0B(C8LZ c8lz, C183978Ee c183978Ee) {
        if (!c183978Ee.A0z) {
            UserSession userSession = c8lz.A0D;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36322650091497862L)) {
                C14120nc.A00().ATO(new C197668od(c8lz, c183978Ee));
                return;
            }
        }
        A0C(c8lz, c183978Ee);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f6, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ed, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x022e, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c4, code lost:
    
        if (r10 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (r7.A00 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c1, code lost:
    
        if (r10.A0B == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c6, code lost:
    
        r9 = r10.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c8, code lost:
    
        if (r9 < 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d0, code lost:
    
        if (r9 >= r10.A0A.size()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d2, code lost:
    
        r9 = r10.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d4, code lost:
    
        r6 = ((com.instagram.ui.text.TextColorScheme) r10.A0A.get(r9)).A06;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        if (r6 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e1, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e2, code lost:
    
        r11 = r8.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e6, code lost:
    
        if (r8.A0y == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e8, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01eb, code lost:
    
        if (r8.A1A != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ee, code lost:
    
        r10 = r3.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f0, code lost:
    
        if (r15 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f2, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f4, code lost:
    
        if (r9 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f8, code lost:
    
        X.AbstractC197438oE.A00(r10, r11, r12, r13, r14, r15, r16);
        r3.A01 = X.C185698Lo.A01(r3, r8);
        r3.A02 = X.C185698Lo.A01(r3, r8);
        r3.A06();
        r3.A00.A00 = r7.A0D();
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.8rf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(final X.C8LZ r26, final X.C183978Ee r27) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LZ.A0C(X.8LZ, X.8Ee):void");
    }

    public static boolean A0D(C8LZ c8lz) {
        C1810981l c1810981l = c8lz.A0I.A02.A01.A0Y;
        c1810981l.getClass();
        if (c1810981l.A08.A00 != C208509Kk.A00) {
            return false;
        }
        return true;
    }

    public static boolean A0E(C8LZ c8lz) {
        CameraAREffect A00 = c8lz.A0R.A00();
        boolean z = false;
        if (!((C8NW) c8lz.A0G.A1h.get()).A19().isEmpty()) {
            z = true;
        }
        if ((A00 != null && A00.A0L()) || z) {
            return true;
        }
        return false;
    }

    public final Bitmap A0F(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3;
        try {
            MultiListenerTextureView multiListenerTextureView = this.A0E.A0D;
            if (multiListenerTextureView != null) {
                bitmap3 = multiListenerTextureView.getBitmap();
            } else {
                bitmap3 = null;
            }
            if (bitmap3 == null) {
                ViewGroup viewGroup = this.A0B;
                bitmap3 = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
                AbstractC12120kG.A01("PhotoViewController#getMediaScreenshot_mediaScreen_is_null", "Could not obtain bitmap from TextureView");
            }
            return A00(bitmap3, bitmap, bitmap2, this);
        } catch (OutOfMemoryError e) {
            AbstractC12120kG.A0H("PhotoViewController#getMediaScreenshot_OOM", e);
            return null;
        }
    }

    public final C198998qz A0G() {
        FilterGroupModelImpl filterGroupModelImpl;
        C203428yz c203428yz;
        int i;
        List list;
        A06(this);
        FilterGroupModel filterGroupModel = this.A03;
        if (filterGroupModel != null) {
            filterGroupModelImpl = filterGroupModel.E3K();
        } else {
            filterGroupModelImpl = null;
            AbstractC12120kG.A01("PhotoViewController#saveEdits:filtergroupmodel_is_null", "");
        }
        CropInfo cropInfo = this.A02;
        if (cropInfo == null) {
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A0H).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            cropInfo = new CropInfo(new Rect(0, 0, width, height), width, height);
        }
        C185698Lo c185698Lo = this.A0M;
        TransformMatrixConfig transformMatrixConfig = c185698Lo.A01;
        if (transformMatrixConfig != null) {
            c203428yz = new C203428yz(transformMatrixConfig.A08);
        } else {
            Integer num = C05F.A00;
            c203428yz = new C203428yz(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false));
        }
        C198988qy c198988qy = new C198988qy(true, c203428yz);
        C8MD c8md = this.A0Z;
        if (c8md != null) {
            i = c8md.AuP();
        } else {
            i = 0;
        }
        CameraAREffect A00 = this.A0R.A00();
        C183688Ct c183688Ct = this.A0G;
        C187028Qv A002 = C8NV.A00(c183688Ct, c8md, this.A0T, false);
        TransformMatrixConfig transformMatrixConfig2 = c185698Lo.A01;
        LinkedHashMap A19 = ((C8NW) c183688Ct.A1h.get()).A19();
        C8MJ c8mj = this.A0a;
        synchronized (c8mj) {
            list = c8mj.A01;
        }
        return new C198998qz(A00, cropInfo, transformMatrixConfig2, c198988qy, A002, filterGroupModelImpl, A19, list, i, false);
    }

    public final void A0H() {
        this.A0B.removeCallbacks(this.A07);
        this.A07 = null;
        C185768Lv c185768Lv = this.A0N;
        C11T.A00();
        C197208nr c197208nr = c185768Lv.A02;
        if (c197208nr != null) {
            c197208nr.A09 = false;
            C197268nx c197268nx = c197208nr.A0K;
            c197268nx.A03 = false;
            c197268nx.A00();
            if (c185768Lv.A02 != null) {
                Map map = c185768Lv.A0B;
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue().equals(c185768Lv.A02)) {
                        Object key = entry.getKey();
                        if (key != null) {
                            map.remove(key);
                        }
                    }
                }
            }
            C178577wV c178577wV = c185768Lv.A01;
            if (c178577wV != null) {
                c178577wV.A04();
                c185768Lv.A01 = null;
            }
            c185768Lv.A02 = null;
        }
        C198528q1 c198528q1 = this.A0R.A04;
        if (c198528q1 != null) {
            c198528q1.A02();
        }
        AnonymousClass878 anonymousClass878 = this.A0d;
        anonymousClass878.release();
        anonymousClass878.A00 = false;
        A03();
    }

    public final void A0I(final C8RZ c8rz) {
        this.A0k.getValue();
        final C183978Ee A03 = this.A0I.A02.A01.A03();
        if (A03 != null) {
            Runnable runnable = new Runnable() { // from class: X.8nk
                @Override // java.lang.Runnable
                public final void run() {
                    C8DL c8dl;
                    final CameraAREffect cameraAREffect;
                    List list;
                    final C8LZ c8lz = this;
                    C183978Ee c183978Ee = A03;
                    C8RZ c8rz2 = c8rz;
                    C8LZ.A0B(c8lz, c183978Ee);
                    C198998qz c198998qz = c8rz2.A05().A02;
                    if (c198998qz != null) {
                        C8MD c8md = c8lz.A0Z;
                        if (c8md != null) {
                            if (c198998qz.A00 == 1112 && (list = c198998qz.A08) != null && list.size() == 9) {
                                c8md.A00();
                                c8lz.A0a.A00(c198998qz.A08);
                            } else {
                                c8md.ESb(c198998qz.A00);
                            }
                        }
                        if (C6PX.A00(c8lz.A0A) && (cameraAREffect = c198998qz.A01) != null) {
                            final String str = cameraAREffect.A0K;
                            c8lz.A06 = new Runnable() { // from class: X.Axb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C8LZ c8lz2 = c8lz;
                                    String str2 = str;
                                    CameraAREffect cameraAREffect2 = cameraAREffect;
                                    C197208nr c197208nr = c8lz2.A0N.A02;
                                    if (c197208nr != null) {
                                        C1819485e c1819485e = c197208nr.A05;
                                        if (c1819485e != null) {
                                            InterfaceC1819785h A00 = c1819485e.A00();
                                            InterfaceC199648sG interfaceC199648sG = c197208nr.A08;
                                            interfaceC199648sG.getClass();
                                            A00.EP6(interfaceC199648sG);
                                        }
                                        if (str2 != null) {
                                            c197208nr.A00();
                                        }
                                    }
                                    c8lz2.A0R.A01(C85B.A03, cameraAREffect2);
                                }
                            };
                        }
                        C198988qy c198988qy = c198998qz.A04;
                        if (c198988qy != null) {
                            c8lz.A0M.A08(c198988qy);
                        }
                    }
                    c8lz.A0E.A05().setVisibility(0);
                    if (c8lz.A08 && (c8dl = c8lz.A0S) != null) {
                        Rect A00 = MX2.A00(C5L6.A0A.A00, c183978Ee.A09, c183978Ee.A06, c183978Ee.A07, false);
                        c8dl.A02.Egh(C8DM.A02);
                        c8lz.A0M.A07(A00);
                        c8lz.A08 = false;
                        C183608Cl c183608Cl = c8lz.A0X;
                        if (c183608Cl != null) {
                            c183608Cl.A03 = true;
                            C183688Ct.A0H(c8lz.A0G, false, false);
                        }
                    }
                    c8lz.A07 = null;
                }
            };
            this.A07 = runnable;
            AbstractC13880nE.A0q(this.A0B, runnable);
        }
    }

    public final void A0J(BBu bBu, ACA aca, C211689Zc c211689Zc, A96 a96, C188538Ws c188538Ws, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        A08(this, bBu, aca, null, c211689Zc, a96, c188538Ws, null, null, num, str, str2, null, str3, null, null, 1, z, z2);
    }

    public final boolean A0K() {
        C5NO c5no;
        boolean z = false;
        if (this.A0R.A00() != null) {
            z = true;
        }
        LinkedHashMap A19 = ((C8NW) this.A0G.A1h.get()).A19();
        UserSession userSession = this.A0D;
        C14360o3.A0B(userSession, 2);
        if (!z) {
            java.util.Set keySet = A19.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() instanceof C202658xj) {
                        java.util.Set keySet2 = A19.keySet();
                        if (!(keySet2 instanceof Collection) || !keySet2.isEmpty()) {
                            for (Object obj : keySet2) {
                                if (!(obj instanceof C202658xj) && !(obj instanceof C210399Se) && !(obj instanceof C210509Sp)) {
                                    break;
                                }
                            }
                        }
                        Iterable iterable = (Iterable) AbstractC001800i.A0A(A19.values());
                        Float f = null;
                        if (iterable != null && (c5no = (C5NO) AbstractC001800i.A0A(iterable)) != null) {
                            f = Float.valueOf(c5no.A09);
                        }
                        if (C14360o3.A0I(f, 0.0f)) {
                            return C18U.A06(C06090Tz.A05, userSession, 36323161192606763L);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C7W5
    public final void CkQ(CharSequence charSequence, boolean z) {
        C8M1 c8m1 = this.A0b;
        String charSequence2 = charSequence.toString();
        C14360o3.A0B(charSequence2, 0);
        if (z) {
            c8m1.A01.A01(charSequence2);
        }
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        C197208nr c197208nr = this.A0N.A02;
        if (c197208nr != null) {
            c197208nr.A09 = true;
            C197268nx c197268nx = c197208nr.A0K;
            c197268nx.A04 = false;
            if (c197268nx.A03) {
                c197268nx.A02.A00(c197268nx.A01);
            }
        }
        C87P c87p = this.A0s;
        if (c87p.A03) {
            c87p.A02 = System.currentTimeMillis();
        }
        this.A0d.onResume();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (A0D(this)) {
            return "stories_postcapture_camera";
        }
        C1810981l c1810981l = this.A0I.A02.A01.A0Y;
        c1810981l.getClass();
        if (c1810981l.A08.A00 == C1811481q.A00) {
            return "note_postcapture_camera";
        }
        return "direct_postcapture_camera";
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        A06(this);
        C197208nr c197208nr = this.A0N.A02;
        if (c197208nr != null) {
            c197208nr.A09 = false;
            c197208nr.A0K.A00();
        }
        C87P c87p = this.A0s;
        if (c87p.A03) {
            c87p.A00 = c87p.A00();
        }
        this.A0d.onPause();
        ((Dialog) this.A0l.getValue()).dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0169, code lost:
    
        if (r12.A08 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x026c, code lost:
    
        if (r5.A0P != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8LZ(android.app.Activity r27, android.view.ViewGroup r28, androidx.fragment.app.Fragment r29, X.C1819485e r30, com.instagram.common.session.UserSession r31, X.C8LJ r32, X.C183688Ct r33, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r34, X.C8HI r35, X.AnonymousClass840 r36, X.C81J r37, X.C1820485o r38, X.C1830289x r39, X.C8LC r40, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver r41, X.InterfaceC1810081c r42, X.C89E r43, X.C87P r44, X.AnonymousClass856 r45, X.C8LT r46, X.C150286pc r47, X.AnonymousClass825 r48, X.C183608Cl r49, X.ViewOnTouchListenerC1829389o r50, X.C8LM r51, X.AnonymousClass878 r52, X.InterfaceC08830cm r53, X.InterfaceC08830cm r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LZ.<init>(android.app.Activity, android.view.ViewGroup, androidx.fragment.app.Fragment, X.85e, com.instagram.common.session.UserSession, X.8LJ, X.8Ct, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8HI, X.840, X.81J, X.85o, X.89x, X.8LC, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver, X.81c, X.89E, X.87P, X.856, X.8LT, X.6pc, X.825, X.8Cl, X.89o, X.8LM, X.878, X.0cm, X.0cm, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        if (r24 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(final X.C8LZ r18, final X.BBu r19, final X.ACA r20, final X.C9ZH r21, final X.C211689Zc r22, final X.A96 r23, final X.C188538Ws r24, final X.C9ZL r25, final java.lang.Boolean r26, final java.lang.Integer r27, final java.lang.String r28, final java.lang.String r29, final java.lang.String r30, final java.lang.String r31, final java.util.List r32, final java.util.List r33, final int r34, final boolean r35, final boolean r36) {
        /*
            r7 = r20
            boolean r0 = r7.A00()
            r2 = 1
            r10 = r23
            r11 = r24
            if (r0 != 0) goto L13
            boolean r0 = r7.A01()
            if (r0 == 0) goto L1e
        L13:
            if (r23 != 0) goto L18
            r1 = 1
            if (r24 == 0) goto L19
        L18:
            r1 = 0
        L19:
            java.lang.String r0 = "storyXShareParams and highlightsInfo are not valid with Direct shares"
            X.C02R.A06(r1, r0)
        L1e:
            r5 = r18
            boolean r0 = r5.A09
            if (r0 != 0) goto L7c
            r5.A09 = r2
            A06(r5)
            X.840 r0 = r5.A0I
            X.83z r0 = r0.A02
            X.83h r0 = r0.A01
            X.8Ee r13 = r0.A03()
            r13.getClass()
            X.B08 r4 = new X.B08
            r18 = r30
            r17 = r29
            r16 = r28
            r15 = r27
            r14 = r26
            r12 = r25
            r24 = r36
            r23 = r35
            r9 = r22
            r22 = r34
            r8 = r21
            r21 = r33
            r20 = r32
            r6 = r19
            r19 = r31
            r4.<init>()
            boolean r0 = r13.A0z
            if (r0 != 0) goto L7d
            com.instagram.common.session.UserSession r3 = r5.A0D
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322650091432325(0x810b4200002985, double:3.033928405169555E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L7d
            X.0nS r1 = X.C14120nc.A00()
            X.9j6 r0 = new X.9j6
            r0.<init>()
            r1.ATO(r0)
        L7c:
            return
        L7d:
            r4.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LZ.A08(X.8LZ, X.BBu, X.ACA, X.9ZH, X.9Zc, X.A96, X.8Ws, X.9ZL, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, boolean, boolean):void");
    }
}
