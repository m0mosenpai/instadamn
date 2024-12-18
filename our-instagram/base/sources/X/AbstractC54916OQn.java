package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.model.WallTextPostItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OQn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54916OQn {
    public static final O9M A00(AbstractC115105If abstractC115105If, int i) {
        C14360o3.A0B(abstractC115105If, 0);
        if (abstractC115105If instanceof C115115Ig) {
            WallText.Res res = new WallText.Res(i, new String[0]);
            if (!(!res.equals(C28154Cb1.A00))) {
                res = new WallText.Res(2131976978, new String[0]);
            }
            return new O9M(res, false);
        }
        if (abstractC115105If instanceof C115095Ie) {
            return C53036Nd8.A00;
        }
        throw B4Z.A00();
    }

    public static final WallPostItem A01(C1DV c1dv, UserSession userSession, WallInfo wallInfo, C60457Qzj c60457Qzj) {
        List list;
        C2JS optionalTreeField;
        C2JS optionalTreeField2;
        C2JS optionalTreeField3;
        C14360o3.A0B(wallInfo, 2);
        C14360o3.A0B(c1dv, 3);
        User A0E = ((C213939ds) c60457Qzj.getRequiredTreeField(3, "author", C60449Qzb.class, 1049858260).reinterpretRequired(0, C213939ds.class, 632736148)).A0E(C1DS.A00(userSession));
        C14360o3.A07(A0E);
        String A0d = MSX.A0d(c60457Qzj, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0);
        String optionalStringField = c60457Qzj.getOptionalStringField(1, "text");
        if (optionalStringField == null) {
            optionalStringField = "";
        }
        boolean A1W = AbstractC167007dF.A1W(c60457Qzj.getOptionalTreeField(9, "viewer_reaction", C60454Qzg.class, -1968830865));
        boolean A1Y = AbstractC31174DnI.A1Y(A0E, userSession.userId);
        int coercedIntField = c60457Qzj.getCoercedIntField(7, "num_reactions");
        ImmutableList optionalCompactedTreeListField = c60457Qzj.getOptionalCompactedTreeListField(8, "reacting_users", C60453Qzf.class, -1879039958);
        WallPostItem wallPostItem = null;
        if (optionalCompactedTreeListField != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator<E> it = optionalCompactedTreeListField.iterator();
            while (it.hasNext()) {
                User A0E2 = ((C213939ds) AbstractC25225BEi.A0l(it).reinterpretRequired(0, C60442QzU.class, -1054605485).getRequiredTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C60441QzT.class, -924824798).reinterpretRequired(0, C213939ds.class, 632736148)).A0E(C1DS.A00(userSession));
                if (A0E2 != null) {
                    A1E.add(A0E2);
                }
            }
            list = AbstractC001800i.A0a(A1E);
        } else {
            list = C16930sl.A00;
        }
        WallPostInfo wallPostInfo = new WallPostInfo(A0E, wallInfo, C7B.A03, A0d, optionalStringField, list, coercedIntField, -1, c60457Qzj.getRequiredTimeField(2, "created_at"), A1Y, false, A1W);
        int ordinal = ((EnumC53289NhR) c60457Qzj.getRequiredEnumField(6, "post_type", EnumC53289NhR.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)).ordinal();
        if (ordinal != 3) {
            if (ordinal != 2) {
                if (ordinal != 1 || (optionalTreeField = c60457Qzj.getOptionalTreeField(11, AbstractC58317Pt9.A00(281), C60452Qze.class, 148059326)) == null || (optionalTreeField2 = optionalTreeField.getOptionalTreeField(1, "images", C60451Qzd.class, 190994083)) == null || (optionalTreeField3 = optionalTreeField2.getOptionalTreeField(0, AbstractC111324zv.A00(212), C60450Qzc.class, 732103033)) == null) {
                    return null;
                }
                String optionalStringField2 = optionalTreeField.getOptionalStringField(0, "gif_media_id");
                if (optionalStringField2 == null) {
                    optionalStringField2 = "";
                }
                String optionalStringField3 = optionalTreeField3.getOptionalStringField(2, "url");
                if (optionalStringField3 == null) {
                    optionalStringField3 = "";
                }
                wallPostItem = new WallGifPostItem(new GifUrlImpl(optionalStringField3, optionalTreeField3.getCoercedIntField(1, IgReactMediaPickerNativeModule.WIDTH), optionalTreeField3.getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT)), wallPostInfo, optionalStringField2);
            } else {
                C2JS optionalTreeField4 = c60457Qzj.getOptionalTreeField(10, "wall_media", C60455Qzh.class, -2076400368);
                if (optionalTreeField4 != null) {
                    C2JS reinterpretRequired = optionalTreeField4.reinterpretRequired(0, C67507Un7.class, 1075338530);
                    C1DU A00 = C1DS.A00(userSession);
                    AtomicBoolean atomicBoolean = C38321qM.A0i;
                    C38321qM A01 = C38801rC.A01(MSZ.A0S(A00), (ImmutablePandoMediaDict) reinterpretRequired.reinterpret(ImmutablePandoMediaDict.class));
                    C14360o3.A07(A01);
                    wallPostItem = new WallMediaPostItem(A01, wallPostInfo);
                }
            }
        } else {
            wallPostItem = new WallTextPostItem(wallPostInfo);
        }
        return wallPostItem;
    }
}
