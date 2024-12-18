package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.8XB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XB implements C82M {
    public int A00;
    public int A01;
    public int A02;
    public Medium A03;
    public C8XE A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Activity A0B;
    public final C1824787m A0C;
    public final AnonymousClass858 A0D;
    public final AbstractC59962oe A0E;
    public final C1815283f A0F;
    public final InterfaceC11380iw A0G;
    public final UserSession A0H;
    public final C1810981l A0I;
    public final C8X4 A0J;
    public final C8HI A0K;
    public final AnonymousClass840 A0L;
    public final C81J A0M;
    public final C1813582n A0N;
    public final C188598Wy A0O;
    public final C8XF A0P;
    public final C8FR A0Q;
    public final C1824987o A0R;
    public final C207549Gh A0S;
    public final InterfaceC1810081c A0T;
    public final C1828789i A0U;
    public final AvatarStickerPreRenderInteractor A0V;
    public final InterfaceC08830cm A0W;
    public final Handler A0X;
    public final View A0Y;
    public final View A0Z;
    public final CallerContext A0a;
    public final C85E A0b;
    public final C3I9 A0c;
    public final C8LZ A0d;
    public final C183688Ct A0e;
    public final TargetViewSizeProvider A0f;
    public final C1821786b A0g;
    public final C8GG A0h;
    public final C82C A0i;
    public final C8XC A0j;
    public final AnonymousClass860 A0k;
    public final C8TI A0l;
    public final C8JI A0m;
    public final C172047lZ A0n;
    public final C8FA A0o;
    public final C8JU A0p;
    public final C8XD A0q;
    public final C8FB A0r;
    public final ViewOnTouchListenerC1829389o A0s;
    public final C1828989k A0t;
    public final InterfaceC08830cm A0u;
    public final InterfaceC08830cm A0v;
    public final InterfaceC09390do A0w;
    public final boolean A0x;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x01b0, code lost:
    
        if (r1 != X.EnumC185548Kw.A03) goto L17;
     */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.8XC] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.8XF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8XB(android.view.View r25, android.view.View r26, X.C1824787m r27, X.AnonymousClass858 r28, X.AbstractC59962oe r29, X.C1815283f r30, X.C85E r31, X.InterfaceC11380iw r32, X.C3I9 r33, X.C1810981l r34, X.C8LZ r35, X.C183688Ct r36, X.C8X4 r37, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r38, X.C8HI r39, X.C1821786b r40, X.AnonymousClass840 r41, X.C8GG r42, X.C81J r43, X.C82C r44, X.C1813582n r45, X.C188598Wy r46, X.C8FR r47, X.C1824987o r48, X.AnonymousClass860 r49, X.C8TI r50, X.C8JI r51, X.C172047lZ r52, X.InterfaceC1810081c r53, X.C8FA r54, X.C8JU r55, X.C8FB r56, X.ViewOnTouchListenerC1829389o r57, X.C1828789i r58, X.InterfaceC08830cm r59, X.InterfaceC08830cm r60, X.InterfaceC08830cm r61, X.InterfaceC09390do r62) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8XB.<init>(android.view.View, android.view.View, X.87m, X.858, X.2oe, X.83f, X.85E, X.0iw, X.3I9, X.81l, X.8LZ, X.8Ct, X.8X4, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8HI, X.86b, X.840, X.8GG, X.81J, X.82C, X.82n, X.8Wy, X.8FR, X.87o, X.860, X.8TI, X.8JI, X.7lZ, X.81c, X.8FA, X.8JU, X.8FB, X.89o, X.89i, X.0cm, X.0cm, X.0cm, X.0do):void");
    }

    public final void A08(final C22P c22p) {
        C14360o3.A0B(c22p, 0);
        if (this.A02 == 3 && (!C1AD.A06(C06090Tz.A05, 18302827038249939L) || c22p != C22P.A0i)) {
            return;
        }
        if (this.A08 && c22p != C22P.A2T) {
            A01();
            this.A0X.post(new Runnable() { // from class: X.9Kj
                @Override // java.lang.Runnable
                public final void run() {
                    C8XB c8xb = this;
                    if (c8xb.A0E.getRootActivity() != null) {
                        C8XB.A02(c22p, c8xb);
                    }
                }
            });
        } else {
            A02(c22p, this);
        }
    }

    public final void A0A(C22P c22p, Integer num, float f) {
        C14360o3.A0B(c22p, 1);
        if (f >= 1.0f) {
            A08(c22p);
        } else if (f == 0.0f) {
            this.A0X.removeCallbacksAndMessages(null);
            A0B(num);
        } else {
            A09(c22p);
        }
    }

    public final void A0B(Integer num) {
        int i;
        C8YY A00;
        C194648jP c194648jP;
        BaseFragmentActivity baseFragmentActivity;
        int i2 = this.A02;
        if (i2 != 1) {
            if (i2 == 3) {
                C55772hI.A00(this.A0H).A07(this.A0B, this.A0K);
            }
            this.A02 = 1;
            C207549Gh c207549Gh = this.A0S;
            if (c207549Gh != null) {
                C208279Jm c208279Jm = c207549Gh.A04;
                if (c208279Jm == null) {
                    C14360o3.A0F("navigationPerfLogger");
                    throw C00O.createAndThrow();
                }
                c208279Jm.A08();
                if (c207549Gh.isAdded() && c207549Gh.getActivity() != null) {
                    C30D.A01(c207549Gh.requireActivity());
                }
                FragmentActivity requireActivity = c207549Gh.requireActivity();
                if ((requireActivity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) requireActivity) != null) {
                    baseFragmentActivity.A0l(true);
                }
            }
            this.A09 = false;
            UserSession userSession = this.A0H;
            C22C A01 = AnonymousClass229.A01(userSession);
            switch (num.intValue()) {
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                default:
                    i = 15;
                    break;
            }
            ((C22F) A01).A04.A02 = i;
            C1815283f c1815283f = this.A0F;
            c1815283f.A00().A07(this.A0j);
            C1815383g A002 = c1815283f.A00();
            C191308dh A003 = this.A0J.A00();
            C14360o3.A0B(A003, 0);
            A002.A05.A0S.remove(A003);
            this.A0l.A0H.COs(null);
            this.A0Y.setVisibility(4);
            if (!C22P.A5D.equals(this.A0N.A00.A01)) {
                Object obj = this.A0W.get();
                C14360o3.A0A(obj);
                ((C188798Xv) obj).A00().A0L(false);
            }
            C1810981l c1810981l = this.A0I;
            Object obj2 = c1810981l.A08.A00;
            if (obj2 == C128535rM.A00 || obj2 == C81R.A00) {
                c1810981l.A0J(C208509Kk.A00);
            }
            C81W c81w = C81W.A0C;
            if (c1810981l.A0W(c81w)) {
                c1810981l.A0M(c81w);
            }
            C188798Xv c188798Xv = (C188798Xv) this.A0W.get();
            if (c188798Xv != null && (A00 = c188798Xv.A00()) != null && (c194648jP = A00.A01) != null) {
                c194648jP.A0E.A0B(c194648jP);
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = c194648jP.A01;
                if (onGlobalLayoutListener != null) {
                    c194648jP.A0D.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            C193838i4 A004 = A00();
            if (A004 != null) {
                A004.A0X();
            }
            C8HI c8hi = this.A0K;
            C1813982r c1813982r = c8hi.A17;
            c1813982r.A09 = false;
            c1813982r.A07 = false;
            c1813982r.A06 = false;
            if (c8hi.A1P) {
                c8hi.A0Y.A08(1.0d, true);
            }
            C183688Ct c183688Ct = this.A0e;
            StoryDraftsCreationViewModel storyDraftsCreationViewModel = c183688Ct.A1R;
            C2GT c2gt = storyDraftsCreationViewModel.A01;
            AbstractC59962oe abstractC59962oe = c183688Ct.A0t;
            c2gt.A05(abstractC59962oe);
            storyDraftsCreationViewModel.A00.A05(abstractC59962oe);
            c183688Ct.A1D.A01.A05(abstractC59962oe);
            c8hi.A0J = false;
            C208769Lk c208769Lk = c8hi.A0C;
            if (c208769Lk != null) {
                c208769Lk.A0L(c8hi.A0g.A0W(C81W.A0T, C81W.A0z), true, false);
            }
            this.A0c.onStop();
            C85E c85e = this.A0b;
            if (c85e != null) {
                c85e.A00();
            }
            AnonymousClass860 anonymousClass860 = this.A0k;
            if (anonymousClass860 != null) {
                anonymousClass860.A02();
            }
            if (AbstractC195888lY.A01(this.A0B.getApplicationContext(), userSession)) {
                this.A0m.A09(true);
            }
            this.A0T.E4u(new Object());
        }
    }

    private final C193838i4 A00() {
        C8YY A00;
        C188798Xv c188798Xv = (C188798Xv) this.A0W.get();
        if (c188798Xv != null && (A00 = c188798Xv.A00()) != null) {
            return A00.A02;
        }
        return null;
    }

    private final void A01() {
        AbstractC13090lv.A02("VisibilityController#minimalInitialization");
        try {
            if (this.A02 == 1) {
                if (C18U.A06(C06090Tz.A05, this.A0H, 36324935014298208L)) {
                    if (!this.A05) {
                        A04();
                    }
                    this.A05 = false;
                }
            }
            C207549Gh c207549Gh = this.A0S;
            if (c207549Gh != null) {
                c207549Gh.A02();
            }
            View view = this.A0Y;
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.requestFocus();
            }
        } finally {
            AbstractC13090lv.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d3, code lost:
    
        if (r9.isEmpty() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03d7, code lost:
    
        if (r22.A0x != false) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03cf A[Catch: all -> 0x04f7, TryCatch #0 {all -> 0x04f7, blocks: (B:3:0x0006, B:5:0x0029, B:6:0x0039, B:8:0x0060, B:9:0x0071, B:11:0x0075, B:12:0x007a, B:14:0x0082, B:15:0x0089, B:17:0x0093, B:19:0x0099, B:23:0x00be, B:24:0x00c1, B:26:0x00c9, B:28:0x00cd, B:29:0x00d0, B:31:0x00e4, B:33:0x00ba, B:34:0x031f, B:123:0x04f6, B:38:0x011c, B:40:0x0124, B:41:0x0136, B:43:0x0141, B:44:0x014a, B:46:0x0152, B:47:0x015b, B:49:0x015f, B:51:0x0163, B:53:0x0167, B:55:0x016b, B:56:0x0192, B:58:0x019b, B:59:0x019e, B:61:0x01a4, B:62:0x01ad, B:64:0x01b7, B:66:0x01bb, B:67:0x01be, B:69:0x01d0, B:70:0x01d5, B:72:0x01e1, B:73:0x01ea, B:75:0x0200, B:77:0x0204, B:78:0x0218, B:80:0x0227, B:82:0x022e, B:83:0x0237, B:85:0x0264, B:86:0x0269, B:88:0x0274, B:89:0x0279, B:90:0x0290, B:92:0x029e, B:94:0x02ae, B:95:0x02b7, B:97:0x02d2, B:99:0x02d8, B:103:0x0319, B:106:0x0328, B:107:0x032b, B:113:0x0343, B:115:0x034e, B:116:0x0355, B:118:0x03f8, B:119:0x03ef, B:121:0x03f5, B:122:0x04f1, B:124:0x0339, B:125:0x035c, B:126:0x0365, B:128:0x0371, B:129:0x0376, B:131:0x0380, B:133:0x0386, B:134:0x038a, B:136:0x038e, B:137:0x0392, B:142:0x03a3, B:144:0x03a9, B:146:0x03b9, B:150:0x03cf, B:152:0x03d5, B:154:0x03d9, B:155:0x03ea, B:158:0x03c0, B:160:0x03ca, B:165:0x040a, B:167:0x0410, B:169:0x0416, B:171:0x041c, B:172:0x0451, B:173:0x0449, B:174:0x044c, B:176:0x0456, B:179:0x0464, B:180:0x046e, B:182:0x0474, B:183:0x047e, B:185:0x048a, B:186:0x04a0, B:188:0x04a9, B:190:0x04ad, B:192:0x04b3, B:195:0x04c4, B:196:0x04e0, B:198:0x04ea, B:201:0x02df, B:202:0x02e9, B:204:0x02f4, B:205:0x02fd, B:207:0x0305, B:208:0x030d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4 A[Catch: all -> 0x04f7, TryCatch #0 {all -> 0x04f7, blocks: (B:3:0x0006, B:5:0x0029, B:6:0x0039, B:8:0x0060, B:9:0x0071, B:11:0x0075, B:12:0x007a, B:14:0x0082, B:15:0x0089, B:17:0x0093, B:19:0x0099, B:23:0x00be, B:24:0x00c1, B:26:0x00c9, B:28:0x00cd, B:29:0x00d0, B:31:0x00e4, B:33:0x00ba, B:34:0x031f, B:123:0x04f6, B:38:0x011c, B:40:0x0124, B:41:0x0136, B:43:0x0141, B:44:0x014a, B:46:0x0152, B:47:0x015b, B:49:0x015f, B:51:0x0163, B:53:0x0167, B:55:0x016b, B:56:0x0192, B:58:0x019b, B:59:0x019e, B:61:0x01a4, B:62:0x01ad, B:64:0x01b7, B:66:0x01bb, B:67:0x01be, B:69:0x01d0, B:70:0x01d5, B:72:0x01e1, B:73:0x01ea, B:75:0x0200, B:77:0x0204, B:78:0x0218, B:80:0x0227, B:82:0x022e, B:83:0x0237, B:85:0x0264, B:86:0x0269, B:88:0x0274, B:89:0x0279, B:90:0x0290, B:92:0x029e, B:94:0x02ae, B:95:0x02b7, B:97:0x02d2, B:99:0x02d8, B:103:0x0319, B:106:0x0328, B:107:0x032b, B:113:0x0343, B:115:0x034e, B:116:0x0355, B:118:0x03f8, B:119:0x03ef, B:121:0x03f5, B:122:0x04f1, B:124:0x0339, B:125:0x035c, B:126:0x0365, B:128:0x0371, B:129:0x0376, B:131:0x0380, B:133:0x0386, B:134:0x038a, B:136:0x038e, B:137:0x0392, B:142:0x03a3, B:144:0x03a9, B:146:0x03b9, B:150:0x03cf, B:152:0x03d5, B:154:0x03d9, B:155:0x03ea, B:158:0x03c0, B:160:0x03ca, B:165:0x040a, B:167:0x0410, B:169:0x0416, B:171:0x041c, B:172:0x0451, B:173:0x0449, B:174:0x044c, B:176:0x0456, B:179:0x0464, B:180:0x046e, B:182:0x0474, B:183:0x047e, B:185:0x048a, B:186:0x04a0, B:188:0x04a9, B:190:0x04ad, B:192:0x04b3, B:195:0x04c4, B:196:0x04e0, B:198:0x04ea, B:201:0x02df, B:202:0x02e9, B:204:0x02f4, B:205:0x02fd, B:207:0x0305, B:208:0x030d), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C22P r21, final X.C8XB r22) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8XB.A02(X.22P, X.8XB):void");
    }

    public static final void A03(C22P c22p, C8XB c8xb) {
        boolean z;
        InterfaceC171187kA A00;
        CameraConfiguration A002;
        CameraTool cameraTool;
        AbstractC13090lv.A02("VisibilityController#onQuickCapturePartiallyVisibleImpl");
        try {
            c8xb.A08 = false;
            c8xb.A0A = true;
            C1813582n c1813582n = c8xb.A0N;
            C81Z c81z = c1813582n.A00;
            if (c22p != c81z.A01) {
                C0f5 AEp = C18950wb.A01.AEp(c8xb.A0G.getModuleName(), 817901356);
                StringBuilder sb = new StringBuilder();
                sb.append("mEntryPoint updated, from ");
                sb.append(c81z.A01);
                sb.append(" to ");
                sb.append(c22p);
                AEp.ABW(DialogModule.KEY_MESSAGE, sb.toString());
                AEp.report();
                c1813582n.A00(c22p);
            }
            int i = c8xb.A02;
            if (i == 3) {
                C55772hI.A00(c8xb.A0H).A07(c8xb.A0B, c8xb.A0K);
                C207549Gh c207549Gh = c8xb.A0S;
                if (c207549Gh != null) {
                    C208279Jm c208279Jm = c207549Gh.A04;
                    if (c208279Jm == null) {
                        C14360o3.A0F("navigationPerfLogger");
                        throw C00O.createAndThrow();
                    }
                    c208279Jm.A08();
                }
            } else if (i == 1) {
                C207549Gh c207549Gh2 = c8xb.A0S;
                if (c207549Gh2 != null) {
                    c207549Gh2.A02();
                }
                if (!c8xb.A05) {
                    c8xb.A04();
                }
                C81J c81j = c8xb.A0M;
                if (!c81j.A3h) {
                    if (c22p.equals(C22P.A5C)) {
                        C1810981l c1810981l = c8xb.A0I;
                        C1811981v c1811981v = c1810981l.A08;
                        C55U c55u = (C55U) c1811981v.A00;
                        C208509Kk c208509Kk = C208509Kk.A00;
                        if (!C14360o3.A0K(c55u, c208509Kk)) {
                            if (C18U.A06(C06090Tz.A05, c8xb.A0H, 36326287928735543L)) {
                                A002 = C82R.A00(c208509Kk, new C81W[0]);
                                A002.A00 = true;
                                c1810981l.A0D(c22p, A002);
                            }
                        }
                        A002 = C82R.A00((C55U) c1811981v.A00, new C81W[0]);
                        A002.A00 = true;
                        c1810981l.A0D(c22p, A002);
                    }
                    c8xb.A0i.A01();
                }
                c8xb.A05 = false;
                C1815283f c1815283f = c8xb.A0F;
                C1815383g A003 = c1815283f.A00();
                C8X4 c8x4 = c8xb.A0J;
                A003.A05.A0J.A00 = c8x4.A00();
                if (c81z.A01 == C22P.A3O) {
                    C1810981l c1810981l2 = c8xb.A0I;
                    if (c1810981l2.A0W(C81W.A0C)) {
                        c1810981l2.A0B();
                    }
                }
                c1815283f.A00().A06(c8xb.A0j);
                C1815383g A004 = c1815283f.A00();
                C191308dh A005 = c8x4.A00();
                C14360o3.A0B(A005, 0);
                A004.A05.A0S.add(A005);
                C1813282k c1813282k = c1815283f.A00().A04;
                InterfaceC174767qC interfaceC174767qC = c1813282k.A02;
                InterfaceC174857qL interfaceC174857qL = c1813282k.A04;
                if (interfaceC174857qL != null && interfaceC174767qC != null) {
                    interfaceC174857qL.E1D();
                    interfaceC174767qC.E1D();
                    z = false;
                } else {
                    z = true;
                }
                c1813282k.A05 = z;
                C8TI c8ti = c8xb.A0l;
                c8ti.A0H.A00(c8ti.A0P, c8ti.A0O);
                InterfaceC1810081c interfaceC1810081c = c8xb.A0T;
                interfaceC1810081c.E4u(new Object());
                View view = c8xb.A0Y;
                view.setVisibility(0);
                view.requestFocus();
                C8HI c8hi = c8xb.A0K;
                c8hi.A17.A09 = true;
                C193838i4 A006 = c8xb.A00();
                if (A006 != null) {
                    A006.A0A = true;
                    A006.A0a.A00 = true;
                }
                final C183688Ct c183688Ct = c8xb.A0e;
                StoryDraftsCreationViewModel storyDraftsCreationViewModel = c183688Ct.A1R;
                C2GT c2gt = storyDraftsCreationViewModel.A01;
                AbstractC59962oe abstractC59962oe = c183688Ct.A0t;
                c2gt.A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8di
                    @Override // X.InterfaceC58362lv
                    public final void onChanged(Object obj) {
                        C183688Ct c183688Ct2 = C183688Ct.this;
                        boolean z2 = ((C9B5) obj).A00;
                        C183758Da c183758Da = c183688Ct2.A1Q;
                        if (z2) {
                            C6WQ c6wq = (C6WQ) c183758Da.A02.getValue();
                            c6wq.A00(c183758Da.A00.getString(2131969964));
                            C0fJ.A00(c6wq);
                            return;
                        }
                        C11T.A02(new RunnableC194758jb(c183758Da));
                    }
                });
                storyDraftsCreationViewModel.A00.A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8dj
                    @Override // X.InterfaceC58362lv
                    public final void onChanged(Object obj) {
                        C183688Ct c183688Ct2 = C183688Ct.this;
                        AbstractC223879uW abstractC223879uW = (AbstractC223879uW) obj;
                        if (!c183688Ct2.A1N.Cae()) {
                            if (abstractC223879uW instanceof C219389mm) {
                                C183758Da c183758Da = c183688Ct2.A1Q;
                                C11T.A02(new RunnableC194758jb(c183758Da));
                                C9GR.A0B(c183758Da.A00, AbstractC111324zv.A00(3035));
                                return;
                            }
                            if (!(abstractC223879uW instanceof C219379ml)) {
                                return;
                            }
                            C183758Da c183758Da2 = c183688Ct2.A1Q;
                            C203238yg c203238yg = ((C219379ml) abstractC223879uW).A00;
                            C14360o3.A0B(c203238yg, 0);
                            C23031Ai A007 = AbstractC23021Ah.A00(c183758Da2.A01);
                            if (!A007.A1s() && c203238yg.A09) {
                                A007.A5C.Egi(A007, true, C23031Ai.A8c[310]);
                                long currentTimeMillis = System.currentTimeMillis();
                                InterfaceC19610xo ARD = A007.A01.ARD();
                                ARD.E7G("story_drafts_expiration_nux_seen_timestamp_ms", currentTimeMillis);
                                ARD.apply();
                                Activity activity = c183758Da2.A00;
                                C193328hC c193328hC = new C193328hC((Context) activity);
                                c193328hC.A05 = activity.getResources().getString(2131974610);
                                c193328hC.A0r(activity.getResources().getString(2131974609));
                                c193328hC.A0J(DialogInterfaceOnClickListenerC23165AOe.A00, 2131968948);
                                c193328hC.A0j(activity.getDrawable(R.drawable.ig_illustrations_illo_ads_megaphone_refresh));
                                c193328hC.A0t(true);
                                C0fJ.A00(c193328hC.A02());
                            }
                            C8Y6 c8y6 = (C8Y6) c183688Ct2.A1x.get();
                            if (c8y6 == null) {
                                return;
                            }
                            C188798Xv c188798Xv = c8y6.A0G;
                            if (!c188798Xv.A01) {
                                return;
                            }
                            if (C18U.A06(C06090Tz.A05, c8y6.A06, 36321915652155277L)) {
                                return;
                            }
                            c188798Xv.A00().A0L(false);
                        }
                    }
                });
                c183688Ct.A1D.A01.A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8dk
                    @Override // X.InterfaceC58362lv
                    public final void onChanged(Object obj) {
                        C183688Ct c183688Ct2 = C183688Ct.this;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        AnonymousClass877 anonymousClass877 = c183688Ct2.A1F;
                        if (booleanValue) {
                            anonymousClass877.A02().pause();
                            C187118Re c187118Re = c183688Ct2.A06;
                            if (c187118Re != null) {
                                C8RZ c8rz = c187118Re.A01;
                                C1816783z c1816783z = c8rz.A0F.A02;
                                C183978Ee A03 = c1816783z.A01.A03();
                                if (A03 != null) {
                                    String str = A03.A0h;
                                    Map map = c187118Re.A00;
                                    if (map.get(str) == null) {
                                        map.put(str, c8rz.A04());
                                        C199008r1 A06 = c8rz.A06(null, c1816783z.A00());
                                        C198958qv c198958qv = A06.A01.A02;
                                        if (c198958qv != null) {
                                            c198958qv.A00 = true;
                                        }
                                        c8rz.A0B(A06);
                                    }
                                }
                            }
                            c183688Ct2.A0m(null, false);
                            c183688Ct2.A15.A00 = true;
                        } else {
                            if (((C8NW) c183688Ct2.A1h.get()).A10() != null) {
                                anonymousClass877.A02().E4S();
                            }
                            C187118Re c187118Re2 = c183688Ct2.A06;
                            if (c187118Re2 != null) {
                                C8RZ c8rz2 = c187118Re2.A01;
                                C183978Ee A032 = c8rz2.A0F.A02.A01.A03();
                                if (A032 != null) {
                                    String str2 = A032.A0h;
                                    Map map2 = c187118Re2.A00;
                                    C199008r1 c199008r1 = (C199008r1) map2.get(str2);
                                    if (c199008r1 != null) {
                                        C198958qv c198958qv2 = c199008r1.A01.A02;
                                        if (c198958qv2 != null) {
                                            c198958qv2.A00 = false;
                                        }
                                        c8rz2.A0B(c199008r1);
                                    }
                                    map2.remove(str2);
                                }
                            }
                            c183688Ct2.A15.A00 = false;
                        }
                        C183688Ct.A0H(c183688Ct2, false, false);
                    }
                });
                C172047lZ c172047lZ = c8xb.A0n;
                if (c172047lZ != null && (A00 = c172047lZ.A00()) != null) {
                    A00.E1E((C55U) c8xb.A0I.A08.A00);
                }
                if (!interfaceC1810081c.Cae() && c8xb.A07 && c81j.A47) {
                    c8hi.A0J = true;
                    C8HI.A0E(c8hi, false);
                }
                String str = c81j.A2p;
                if (str != null) {
                    C8FB c8fb = c8xb.A0r;
                    C5GJ c5gj = c81j.A0A;
                    if (c5gj != null) {
                        c8fb.A01(c5gj, str);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                c8xb.A0I.A0C();
            }
            c8xb.A02 = 2;
            if (c8xb.A00() != null) {
                C81J c81j2 = c8xb.A0M;
                if (c81j2.A2o != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    C14360o3.A07(createBitmap);
                    C193838i4 A007 = c8xb.A00();
                    C14360o3.A0A(A007);
                    String str2 = c81j2.A2o;
                    C14360o3.A0A(str2);
                    A007.DpK(createBitmap, str2);
                    c8xb.A0A = false;
                }
            }
            C8XE c8xe = c8xb.A04;
            if (c8xe != null) {
                GenAIToolInfoDict genAIToolInfoDict = c8xb.A0M.A0I;
                if (genAIToolInfoDict != null) {
                    cameraTool = genAIToolInfoDict.A00;
                } else {
                    cameraTool = null;
                }
                if (cameraTool == CameraTool.A1h) {
                    C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl(c8xe.A06), c8xb.A0G.getModuleName());
                    A0J.A02(c8xb.A0P);
                    A0J.A01();
                } else if (cameraTool == CameraTool.A1i) {
                    AbstractC23641Du.A05(AnonymousClass191.A00, new C25023B5e(c8xb, (InterfaceC23621Ds) null, 13), C07Y.A00(c8xb.A0E));
                }
                c8xb.A04 = null;
            } else {
                Medium medium = c8xb.A03;
                if (medium != null) {
                    int i2 = medium.A08;
                    C1828789i c1828789i = c8xb.A0U;
                    if (i2 == 1) {
                        c1828789i.A01(medium);
                    } else {
                        C8XA c8xa = c1828789i.A02;
                        if (c8xa != null) {
                            if (c8xa.A00().A02 != 1) {
                                c1828789i.A0A.A08(AbstractC189418aK.A01(c1828789i.A06));
                                Activity activity = c1828789i.A05;
                                UserSession userSession = c1828789i.A08;
                                C1828689h c1828689h = c1828789i.A09;
                                C22838A5h c22838A5h = new C22838A5h(c1828789i);
                                boolean z2 = !C1828689h.A00(c1828689h, "video_import");
                                List singletonList = Collections.singletonList(medium);
                                C14360o3.A07(singletonList);
                                C23795Ag6 c23795Ag6 = new C23795Ag6(c22838A5h);
                                C121275eQ c121275eQ = new C121275eQ(new M85(activity, userSession, singletonList, z2), 468);
                                c121275eQ.A00 = new C45684KJv(c23795Ag6);
                                C1GJ.A03(c121275eQ);
                            }
                        } else {
                            C14360o3.A0F("visibilityControllerComponentProvider");
                            throw C00O.createAndThrow();
                        }
                    }
                }
                c8xb.A03 = null;
            }
            c8xb.A0A = false;
        } finally {
            AbstractC13090lv.A01();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [X.8hA] */
    public final void A04() {
        String str;
        String str2;
        EnumC50631MWs enumC50631MWs;
        List list;
        UserSession userSession = this.A0H;
        if (((C22F) AnonymousClass229.A01(userSession)).A04.A0L == null) {
            Activity activity = this.A0B;
            C81J c81j = this.A0M;
            String str3 = c81j.A2I;
            String str4 = c81j.A2G;
            C1816283r c1816283r = c81j.A18;
            PromptStickerModel promptStickerModel = null;
            if (c1816283r != null) {
                str = c1816283r.A04.A38();
            } else {
                str = null;
            }
            C1816283r c1816283r2 = c81j.A18;
            if (c1816283r2 != null) {
                str2 = c1816283r2.A04.A0C.getLoggingInfoToken();
            } else {
                str2 = null;
            }
            C22C A00 = AnonymousClass229.A00(activity, userSession, str3, str4, str, str2);
            Long l = c81j.A2A;
            if (l != null) {
                ((C22F) A00).A04.A0H = l;
            }
            String str5 = c81j.A2Z;
            C22M c22m = ((C22F) A00).A04;
            c22m.A0R = str5;
            c22m.A0S = c81j.A2a;
            ((C22F) AnonymousClass229.A01(userSession)).A04.A0F = new Object() { // from class: X.8hA
            };
            C22C A01 = AnonymousClass229.A01(userSession);
            C22P c22p = this.A0N.A00.A01;
            String str6 = c81j.A2Q;
            String str7 = c81j.A2g;
            String str8 = c81j.A2b;
            C8JW c8jw = c81j.A0C;
            String str9 = c81j.A2I;
            String str10 = c81j.A2J;
            String str11 = c81j.A2K;
            int A002 = C56D.A00(activity);
            C1810981l c1810981l = this.A0I;
            AbstractC449424y.A01(c1810981l.A0A());
            if (this.A0T.Cae()) {
                enumC50631MWs = EnumC50631MWs.A0I;
            } else {
                enumC50631MWs = EnumC50631MWs.A0J;
            }
            C8HI c8hi = this.A0K;
            C1816783z c1816783z = this.A0L.A02;
            int i = 2;
            Integer A0N = c8hi.A0N();
            if (A0N == null || A0N.intValue() != 0) {
                i = 1;
            }
            EnumC190198bd A003 = AbstractC190188bc.A00(this.A0f);
            C1815483h c1815483h = c1816783z.A01;
            C5JK c5jk = c1815483h.A0h;
            C3o9 c3o9 = c81j.A1J;
            C81W c81w = c81j.A0X;
            if (c81w != null) {
                list = Collections.singletonList(c81w);
                C14360o3.A07(list);
            } else {
                list = null;
            }
            PromptStickerModel promptStickerModel2 = c1815483h.A09;
            if (promptStickerModel2 == null) {
                C1816683y c1816683y = c81j.A12;
                if (c1816683y != null) {
                    promptStickerModel = c1816683y.A01;
                }
            } else {
                promptStickerModel = promptStickerModel2;
            }
            A01.A16(c22p, A003, enumC50631MWs, c8jw, c1810981l, c5jk, c3o9, promptStickerModel, str6, str7, str8, str9, str10, str11, list, A002, i);
            if (userSession.A00(C4T5.class) != null) {
                C0w9.A07("ARPlatformLoggerFactory", new IllegalArgumentException("ARPlatformLogger object already exist"));
            }
            userSession.A04(C4T5.class, new C4T5(userSession));
        }
    }

    public final void A05() {
        short s;
        C8YY A00;
        UserSession userSession = this.A0H;
        C006802i c006802i = C006802i.A0p;
        InterfaceC1810081c interfaceC1810081c = this.A0T;
        if (!interfaceC1810081c.Cap()) {
            C9GR.A01(this.A0B, "story_share_intent_while_editing_media_error", 2131974718, 1);
            if (c006802i.isMarkerOn(18951415)) {
                c006802i.markerAnnotate(18951415, TraceFieldType.FailureReason, "share_intent_while_editing_media");
                s = 3;
            } else {
                return;
            }
        } else {
            C198278pc A002 = C198278pc.A0A.A00();
            C188798Xv c188798Xv = (C188798Xv) this.A0W.get();
            if (c188798Xv != null && (A00 = c188798Xv.A00()) != null) {
                A00.A0L(false);
            }
            C1813582n c1813582n = this.A0N;
            C81Z c81z = c1813582n.A00;
            if (c81z.A01 != C22P.A5H) {
                c1813582n.A00(C22P.A5E);
            }
            this.A09 = true;
            interfaceC1810081c.E4u(new Object());
            this.A0L.A02.A08(AbstractC189418aK.A01(c81z.A01));
            C8Y3 c8y3 = (C8Y3) this.A0v.get();
            if (c8y3 != null) {
                Activity activity = this.A0B;
                List list = A002.A09;
                Medium medium = A002.A03;
                C14360o3.A0B(list, 1);
                C1GJ.A03(new C121275eQ(new CallableC44058Jdj(activity, medium, userSession, c8y3, list), 470));
            }
            C183688Ct c183688Ct = this.A0e;
            c183688Ct.A0Y = A002.A08;
            String str = A002.A05;
            if (str != null) {
                C8NW c8nw = (C8NW) c183688Ct.A1h.get();
                if (str.length() != 0) {
                    UserSession userSession2 = c8nw.A0r;
                    if (C18U.A06(C06090Tz.A05, userSession2, 36320180485300346L)) {
                        c8nw.A0O = true;
                        UFV.A04(C70827Whk.A00((C70827Whk) c8nw.A1c.get()), new C5QL(str));
                    } else {
                        Editable newEditable = Editable.Factory.getInstance().newEditable(str);
                        C190888ck A01 = AbstractC190898cl.A01("classic", null, false);
                        C14360o3.A0A(newEditable);
                        AbstractC202958yD.A00(newEditable, A01);
                        Context context = c8nw.A0f;
                        AbstractC202838y1.A02(context, newEditable, A01);
                        C190958cr c190958cr = A01.A06;
                        C9PX c9px = new C9PX(context, userSession2, c190958cr.A00(context));
                        Context context2 = c9px.A0Z;
                        C14360o3.A07(context2);
                        c9px.A0A(context2.getResources().getDimensionPixelSize(c190958cr.A05) * 1.0f);
                        c9px.A0L(newEditable);
                        c9px.A0I(AbstractC202838y1.A01(AbstractC15960qq.A00(context2), A01.A05));
                        AbstractC202948yC.A00(null, A01, c9px);
                        AbstractC190978ct.A03(newEditable);
                        c8nw.AAW(c9px, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, c190958cr.A02, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false));
                        ((C190398bx) c8nw.A1d.get()).A0c(c9px);
                    }
                }
            }
            if (!c006802i.isMarkerOn(18951415)) {
                return;
            } else {
                s = 2;
            }
        }
        c006802i.markerEnd(18951415, s);
    }

    public final void A06() {
        if (this.A0I.A08.A00 == C208509Kk.A00 && this.A02 == 3) {
            C180257zF c180257zF = C180257zF.A00;
            Activity activity = this.A0B;
            UserSession userSession = this.A0H;
            c180257zF.A00(activity, userSession, AbstractC23021Ah.A00(userSession));
        }
    }

    public final void A07() {
        Activity activity = this.A0B;
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A07(applicationContext);
        UserSession userSession = this.A0H;
        if (((Boolean) AbstractC172747mk.A00(applicationContext, userSession).A06.getValue()).booleanValue() && this.A0I.A08.A00 == C208509Kk.A00 && this.A02 == 3 && !AbstractC23021Ah.A00(userSession).A01.getBoolean(AbstractC43591JPw.A00(211), false)) {
            new C22988ABn(activity).A00(true);
        }
    }

    public final void A09(final C22P c22p) {
        if (!this.A0A) {
            if (this.A08 && c22p != C22P.A2T) {
                A01();
                this.A0X.post(new Runnable() { // from class: X.7k8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8XB c8xb = this;
                        if (c8xb.A0E.getRootActivity() != null) {
                            C8XB.A03(c22p, c8xb);
                        }
                    }
                });
            } else {
                A03(c22p, this);
            }
        }
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ void A7T(Parcelable parcelable) {
        VisibilityControllerComponentInterface$State visibilityControllerComponentInterface$State = (VisibilityControllerComponentInterface$State) parcelable;
        if (visibilityControllerComponentInterface$State != null) {
            this.A02 = visibilityControllerComponentInterface$State.A02;
            this.A00 = visibilityControllerComponentInterface$State.A00;
            this.A01 = visibilityControllerComponentInterface$State.A01;
            this.A09 = visibilityControllerComponentInterface$State.A08;
            this.A03 = visibilityControllerComponentInterface$State.A03;
            this.A06 = visibilityControllerComponentInterface$State.A05;
            this.A05 = visibilityControllerComponentInterface$State.A04;
            this.A0A = visibilityControllerComponentInterface$State.A09;
            this.A07 = visibilityControllerComponentInterface$State.A06;
            this.A08 = visibilityControllerComponentInterface$State.A07;
        }
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ Parcelable ANh() {
        return new VisibilityControllerComponentInterface$State(this.A03, this.A02, this.A00, this.A01, this.A09, this.A06, this.A05, this.A0A, this.A07, this.A08);
    }
}
