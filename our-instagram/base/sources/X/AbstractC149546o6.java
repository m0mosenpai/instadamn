package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.user.model.User;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC149546o6 {
    public C146016hy A00;
    public C145726hV A01;
    public final String A02;

    public final void A03(final Activity activity, final C37771pE c37771pE, final C3G2 c3g2) {
        final C41181vS AuU;
        if (this instanceof C143536ds) {
            final C143536ds c143536ds = (C143536ds) this;
            C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
            if (c146016hy != null && (AuU = c146016hy.A04.AuU()) != null && AuU.A1d()) {
                EMD emd = new EMD();
                UserSession userSession = c143536ds.A01;
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0U = new C43014J0f(AuU, c3g2, c143536ds);
                final C189478aR A00 = c189448aO.A00();
                emd.A00 = new View.OnClickListener() { // from class: X.IjZ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C143536ds c143536ds2 = c143536ds;
                        C41181vS c41181vS = AuU;
                        C3G2 c3g22 = c3g2;
                        C189478aR c189478aR = A00;
                        Activity activity2 = activity;
                        C37771pE c37771pE2 = c37771pE;
                        C37947Gmp c37947Gmp = C37947Gmp.A00;
                        UserSession userSession2 = c143536ds2.A01;
                        c41181vS.A0k.getClass();
                        C14360o3.A0B(userSession2, 0);
                        AbstractC12220kQ.A01(c37947Gmp, userSession2);
                        C14360o3.A07(AbstractC166997dE.A0n());
                        c189478aR.A0L(null);
                        AbstractC41658Ibq.A01(activity2, userSession2, c37771pE2, c3g22);
                    }
                };
                A00.A02(activity, emd);
                C37947Gmp c37947Gmp = C37947Gmp.A00;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c3g2, 2);
                if (AuU.A1d()) {
                    C18920wW A01 = AbstractC12220kQ.A01(c37947Gmp, userSession);
                    String obj = UUID.randomUUID().toString();
                    C14360o3.A07(obj);
                    InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_story_standouts_eligible_bottom_sheet_impression");
                    if (A002.isSampled()) {
                        A002.AAP("tracking_token", obj);
                        A002.AAP("reel_id_type", "superlativeReel");
                        A002.AAP("reel_id", AuU.A0k);
                        A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C37947Gmp.A00(c3g2).name());
                        A002.Cht();
                    }
                }
                c143536ds.A00 = true;
                C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
                if (c145726hV != null) {
                    c145726hV.A01();
                }
            }
        }
    }

    public final void A04(Activity activity, C3G2 c3g2) {
        C41181vS AuU;
        if (this instanceof C143536ds) {
            C143536ds c143536ds = (C143536ds) this;
            C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
            if (c146016hy != null && (AuU = c146016hy.A04.AuU()) != null && AuU.A1d()) {
                C33084Eih c33084Eih = new C33084Eih();
                C143536ds.A00(c33084Eih, c143536ds).A00().A02(activity, c33084Eih);
                C37947Gmp.A00.A04(c143536ds.A01, c3g2, AuU.A0k);
                c143536ds.A00 = true;
                C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
                if (c145726hV != null) {
                    c145726hV.A01();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36325278612009947L) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36325278612337632L) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(android.content.Context r22, X.C102134ij r23, X.C41551w4 r24, X.MPC r25, java.lang.String r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC149546o6.A05(android.content.Context, X.4ij, X.1w4, X.MPC, java.lang.String, boolean, boolean):void");
    }

    public final void A06(Context context, EnumC138476Pd enumC138476Pd) {
        String str;
        C41181vS AuU;
        C38321qM c38321qM;
        if (this instanceof C143536ds) {
            C143536ds c143536ds = (C143536ds) this;
            C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
            if (c146016hy != null && (AuU = c146016hy.A04.AuU()) != null && (c38321qM = AuU.A0b) != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            Bundle bundle = new Bundle();
            bundle.putString(AbstractC43591JPw.A00(1272), enumC138476Pd.A00);
            bundle.putString("source_media_id", str);
            abstractC59962oe.setArguments(bundle);
            C143536ds.A01(context, abstractC59962oe, c143536ds);
        }
    }

    public final void A07(Context context, C41551w4 c41551w4, String str, String str2) {
        C143536ds c143536ds;
        UserSession userSession;
        C41181vS A08;
        User user;
        C41181vS c41181vS;
        String str3;
        if ((this instanceof C143536ds) && (user = (A08 = c41551w4.A08((userSession = (c143536ds = (C143536ds) this).A01))).A0i) != null) {
            boolean z = false;
            if (A08.A0G() == null) {
                C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
                C38321qM c38321qM = null;
                if (c146016hy != null) {
                    c41181vS = c146016hy.A04.AuU();
                    if (c41181vS != null) {
                        c38321qM = c41181vS.A0b;
                    }
                } else {
                    c41181vS = null;
                }
                if (c38321qM != null) {
                    c41181vS.getClass();
                    String A0V = c41181vS.A0V(userSession);
                    if (A0V == null) {
                        A0V = "ad ID is null";
                    }
                    C146016hy c146016hy2 = ((AbstractC149546o6) c143536ds).A00;
                    if (c146016hy2 != null) {
                        str3 = c146016hy2.A02.getModuleName();
                    } else {
                        str3 = "";
                    }
                    C0K8.A0O("ShoppingMoreProductsFragment", "Ad ID is: %s", A0V);
                    C0K8.A0O("ShoppingMoreProductsFragment", "Media ID is: %s", c38321qM.getId());
                    C0K8.A0O("ShoppingMoreProductsFragment", "Module name is: %s", str3);
                } else {
                    C0K8.A0C("ShoppingMoreProductsFragment", "item.getStoryAdCaption() is null but cannot get ad id because we cannot access media");
                }
            }
            C6QX A0G = A08.A0G();
            C18C.A07(A0G, "Caption model shouldn't be null");
            if ((str2 != null || (str2 = A0G.A06) != null) && !TextUtils.isEmpty(str2)) {
                z = true;
            }
            C18C.A0G(z, "Caption text shouldn't be null or empty");
            C14360o3.A0B(str2, 0);
            C14360o3.A0B(str, 1);
            C38936HCj c38936HCj = new C38936HCj();
            Bundle bundle = new Bundle();
            bundle.putString("args_caption_text", str2);
            bundle.putString("args_previous_module_name", str);
            c38936HCj.setArguments(bundle);
            c38936HCj.A02 = A08;
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0d = user.B8y();
            c189448aO.A1G = true;
            c189448aO.A0x = true;
            c189448aO.A0T = new J0T(c143536ds, c38936HCj);
            c189448aO.A0U = new J0Y(c143536ds);
            C189478aR A00 = c189448aO.A00();
            c38936HCj.A03 = new C41117IIi(A00, c41551w4, A0G, c143536ds);
            A00.A03(context, c38936HCj);
            C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
            if (c145726hV != null) {
                c145726hV.A01();
            }
        }
    }

    public final boolean A08(C84823qW c84823qW) {
        Object obj;
        if (this instanceof C143536ds) {
            int ordinal = c84823qW.A12.ordinal();
            if (ordinal != 36) {
                if (ordinal == 23) {
                    String str = c84823qW.A1h;
                    if ("mention_professional_username".equals(str) || "mention_diversity_username".equals(str)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            MultiProductSticker multiProductSticker = c84823qW.A0o;
            multiProductSticker.getClass();
            List<StoryMultiProductStickerLinkData> list = multiProductSticker.A08;
            if (list != null) {
                for (StoryMultiProductStickerLinkData storyMultiProductStickerLinkData : list) {
                    if (storyMultiProductStickerLinkData.BNX() == null) {
                        obj = null;
                    } else {
                        obj = EnumC906041v.A01.get(storyMultiProductStickerLinkData.BNX().intValue());
                    }
                    if (obj == EnumC906041v.IG_DESTINATION_SHOPPING_SHEET) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public AbstractC149546o6() {
        String obj = UUID.randomUUID().toString();
        this.A02 = obj;
        AbstractC141816ay.A00.put(obj, this);
    }
}
