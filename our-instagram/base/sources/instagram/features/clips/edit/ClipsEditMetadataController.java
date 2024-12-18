package instagram.features.clips.edit;

import X.AbstractC001800i;
import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC33656Eu6;
import X.AbstractC37301Gc2;
import X.AbstractC50102Ry;
import X.AbstractC53242c7;
import X.AbstractC54040Nuq;
import X.AbstractC54041Nur;
import X.AbstractC54878OOt;
import X.AbstractC59962oe;
import X.AbstractC63302u8;
import X.AbstractC69933Cc;
import X.AbstractC85953sP;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C101394gx;
import X.C121275eQ;
import X.C140966Yy;
import X.C14160ng;
import X.C14360o3;
import X.C168607fu;
import X.C16930sl;
import X.C189478aR;
import X.C18U;
import X.C193328hC;
import X.C1GJ;
import X.C1GL;
import X.C1ON;
import X.C1XJ;
import X.C30181DRm;
import X.C38321qM;
import X.C38686GzR;
import X.C50689MZh;
import X.C50880MeB;
import X.C50887MeI;
import X.C50994Mg1;
import X.C51034Mgi;
import X.C51143Mim;
import X.C51685MsG;
import X.C51776Mug;
import X.C52094N2u;
import X.C54626OBb;
import X.C54778OIs;
import X.C54813OKo;
import X.C54816OKr;
import X.C54839OLy;
import X.C54966OSw;
import X.C55346Oi6;
import X.C55983OtG;
import X.C56034Ou6;
import X.C56037Ou9;
import X.C56135Ovv;
import X.C56352iT;
import X.C56738PGg;
import X.C56740PGi;
import X.C56741PGj;
import X.C57537PgB;
import X.C8YE;
import X.EZ9;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC41501vz;
import X.InterfaceC58040PoQ;
import X.InterfaceC58077Pp2;
import X.InterfaceC58116Ppf;
import X.InterfaceC58158PqN;
import X.InterfaceC60602pj;
import X.MSZ;
import X.N5Z;
import X.N60;
import X.OBM;
import X.OWd;
import X.PUG;
import X.ViewOnClickListenerC55463OkI;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.model.venue.Venue;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ClipsEditMetadataController implements InterfaceC11380iw, InterfaceC60602pj, InterfaceC58116Ppf, InterfaceC58040PoQ {
    public TextView A00;
    public TextView A01;
    public C38686GzR A02;
    public C51776Mug A03;
    public BrandedContentGatingInfoIntf A04;
    public BrandedContentProjectMetadataIntf A05;
    public MediaGenAIDetectionMethod A06;
    public C52094N2u A07;
    public C14160ng A08;
    public C51685MsG A09;
    public C54778OIs A0A;
    public C54839OLy A0B;
    public C54966OSw A0C;
    public C38321qM A0D;
    public C168607fu A0E;
    public C189478aR A0F;
    public Venue A0G;
    public MusicOverlayStickerModel A0H;
    public TaggingFeedMultiSelectState A0I;
    public IgAutoCompleteTextView A0J;
    public C8YE A0K;
    public File A0L;
    public Boolean A0M;
    public String A0N;
    public List A0O;
    public List A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public TextView A0h;
    public BrandedContentProjectMetadataIntf A0i;
    public C56037Ou9 A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final Context A0n;
    public final Handler A0o;
    public final TextWatcher A0p;
    public final AbstractC59962oe A0q;
    public final InterfaceC11380iw A0r;
    public final UserSession A0s;
    public final C1GL A0t;
    public final C56135Ovv A0u;
    public final MonetizationRepository A0v;
    public final C54813OKo A0w;
    public final C101394gx A0x;
    public final C54816OKr A0y;
    public final InterfaceC58077Pp2 A0z;
    public final N60 A10;
    public final N60 A11;
    public final OBM A12;
    public final String A13;
    public final String A14;
    public final List A15;
    public final InterfaceC09390do A16;
    public final InterfaceC09390do A17;
    public final InterfaceC09390do A18;
    public final InterfaceC09390do A19;
    public final InterfaceC09390do A1A;
    public final InterfaceC09390do A1B;
    public final boolean A1C;
    public final C56352iT A1D;
    public final InterfaceC41501vz A1E;
    public final C1GL A1F;
    public final IncentivePlatformApi A1G;
    public Group audienceGroup;
    public TextView audienceTextView;
    public TextView commentPollTextView;
    public ViewGroup coverPhotoContainer;
    public Group genAIGroup;
    public View genAIToggleRow;
    public OWd locationSuggestionsRow;
    public Group locationTaggingGroup;
    public View metaVerifiedAddLinkRow;
    public IgSimpleImageView metaVerifiedAddLinkRowChevronIconView;
    public IgSimpleImageView metaVerifiedAddLinkRowClearButtonView;
    public TextView metaVerifiedAddLinkRowSubtitleTextView;
    public TextView metaVerifiedAddLinkRowTitleTextView;
    public ViewGroup optionsContainer;
    public Group peopleTaggingGroup;
    public View peopleTaggingRow;
    public C56738PGg productTagViewHolder;
    public Group productTaggingGroup;
    public TextView taggedPeopleTextView;
    public IgImageView thumbnailImage;
    public View view;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQB() {
        A05(null, this);
        A0K();
    }

    @Override // X.InterfaceC58040PoQ
    public final void Dl4(List list, String str) {
        C14360o3.A0B(list, 0);
        UserSession userSession = this.A0s;
        if (str != null) {
            this.A0A = new C54778OIs(this.A0r, userSession, str, list);
        }
        OWd oWd = this.locationSuggestionsRow;
        if (oWd != null) {
            ArrayList A1F = AbstractC166987dD.A1F(list);
            int size = A1F.size();
            int i = 5;
            if (5 > size) {
                i = size;
            }
            List subList = A1F.subList(0, i);
            C14360o3.A0B(subList, 0);
            C51143Mim c51143Mim = oWd.A04;
            AbstractC31175DnJ.A0x(c51143Mim, subList, c51143Mim.A00);
            OWd.A00(oWd, oWd.A02);
            return;
        }
        C14360o3.A0F("locationSuggestionsRow");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram.features.clips.edit.ClipsEditMetadataController";
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0169, code lost:
    
        if (r8 == com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.8YD, java.lang.Object] */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final ArrayList A01(C38321qM c38321qM) {
        ?? r3;
        List coauthorProducers = c38321qM.A0C.getCoauthorProducers();
        if (coauthorProducers != null) {
            r3 = AbstractC167007dF.A0i(coauthorProducers);
            Iterator it = coauthorProducers.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1V(r3, it);
            }
        } else {
            r3 = C16930sl.A00;
        }
        List A3i = c38321qM.A3i();
        ArrayList A0i = AbstractC167007dF.A0i(A3i);
        Iterator it2 = A3i.iterator();
        while (it2.hasNext()) {
            AbstractC167017dG.A1V(A0i, it2);
        }
        return AbstractC001800i.A0S(A0i, r3);
    }

    private final void A02() {
        C54626OBb c54626OBb;
        if (this.A07 != null) {
            if (C18U.A06(C06090Tz.A05, this.A0s, 36311766644294407L)) {
                View requireViewById = A0I().requireViewById(R.id.funded_content_tag);
                C14360o3.A07(requireViewById);
                requireViewById.setVisibility(0);
                AbstractC31172DnG.A1J(A0I(), R.id.funded_content_tagging_divider, 0);
                this.A0h = AbstractC166997dE.A0T(A0I(), R.id.funded_content_tag_subtitle);
                C52094N2u c52094N2u = this.A07;
                if (c52094N2u != null && (c54626OBb = c52094N2u.A00) != null && c54626OBb.A00 != null) {
                    TextView A0N = AbstractC167007dF.A0N(A0I(), R.id.funded_content_tag_title);
                    Context context = this.A0n;
                    A0N.setTextColor(context.getResources().getColor(AbstractC53242c7.A09(context)));
                    requireViewById.setBackground(null);
                    requireViewById.setFocusable(true);
                    return;
                }
                ViewOnClickListenerC55463OkI.A00(requireViewById, 46, this);
                TextView textView = this.A0h;
                if (textView != null) {
                    A03(textView);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    private final void A03(TextView textView) {
        Context context = this.A0n;
        Drawable A00 = AbstractC13620mo.A00(context, R.drawable.instagram_chevron_right_pano_outline_16);
        C14360o3.A07(A00);
        AbstractC85953sP.A02(context, A00, R.attr.glyphColorTertiary);
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(textView, 0);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, A00, (Drawable) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02f2, code lost:
    
        if (r4 != true) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0355, code lost:
    
        if (r4 != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0374, code lost:
    
        if (r4 != true) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C38321qM r20, instagram.features.clips.edit.ClipsEditMetadataController r21) {
        /*
            Method dump skipped, instructions count: 1621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A04(X.1qM, instagram.features.clips.edit.ClipsEditMetadataController):void");
    }

    public static final void A05(Venue venue, ClipsEditMetadataController clipsEditMetadataController) {
        clipsEditMetadataController.A0G = venue;
        OWd oWd = clipsEditMetadataController.locationSuggestionsRow;
        if (oWd != null) {
            oWd.A02(venue);
            if (clipsEditMetadataController.A0D != null) {
                clipsEditMetadataController.A0X = !AbstractC50102Ry.A00(r0.A27(), venue);
                A0C(clipsEditMetadataController);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C14360o3.A0F("locationSuggestionsRow");
        throw C00O.createAndThrow();
    }

    public static final void A06(ClipsEditMetadataController clipsEditMetadataController) {
        String A00;
        String str;
        if (clipsEditMetadataController.A0v.A04(UserMonetizationProductType.A0E)) {
            if (!clipsEditMetadataController.A0a) {
                clipsEditMetadataController.A0a = true;
                C56135Ovv c56135Ovv = clipsEditMetadataController.A0u;
                Integer num = C05F.A00;
                C52094N2u c52094N2u = clipsEditMetadataController.A07;
                if (c52094N2u != null) {
                    C54626OBb c54626OBb = c52094N2u.A00;
                    if (c54626OBb != null) {
                        str = c54626OBb.A01;
                    } else {
                        str = null;
                    }
                    c56135Ovv.A00(num, str, clipsEditMetadataController.A13, null);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            View requireViewById = clipsEditMetadataController.A0I().requireViewById(R.id.bonuses_tag);
            C14360o3.A07(requireViewById);
            requireViewById.setVisibility(0);
            AbstractC31172DnG.A1J(clipsEditMetadataController.A0I(), R.id.bonuses_tagging_divider, 0);
            clipsEditMetadataController.A00 = AbstractC166997dE.A0T(clipsEditMetadataController.A0I(), R.id.bonuses_tag_subtitle);
            C52094N2u c52094N2u2 = clipsEditMetadataController.A07;
            if (c52094N2u2 != null) {
                C54626OBb c54626OBb2 = c52094N2u2.A00;
                if (c54626OBb2 != null && c54626OBb2.A00 != null) {
                    TextView A0N = AbstractC167007dF.A0N(clipsEditMetadataController.A0I(), R.id.bonuses_tag_title);
                    Context context = clipsEditMetadataController.A0n;
                    A0N.setTextColor(context.getResources().getColor(AbstractC53242c7.A09(context)));
                    requireViewById.setBackground(null);
                    requireViewById.setFocusable(true);
                } else {
                    ViewOnClickListenerC55463OkI.A00(requireViewById, 45, clipsEditMetadataController);
                    TextView textView = clipsEditMetadataController.A00;
                    if (textView != null) {
                        clipsEditMetadataController.A03(textView);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        TextView textView2 = clipsEditMetadataController.A00;
        if (textView2 != null) {
            C51776Mug c51776Mug = clipsEditMetadataController.A03;
            if (c51776Mug != null) {
                List list = c51776Mug.A01;
                C52094N2u c52094N2u3 = clipsEditMetadataController.A07;
                if (c52094N2u3 != null) {
                    C54626OBb c54626OBb3 = c52094N2u3.A00;
                    if (c54626OBb3 != null && (A00 = c54626OBb3.A01) != null) {
                        if (!c54626OBb3.A03) {
                            A00 = AbstractC166997dE.A0p(clipsEditMetadataController.A0n, 2131968670);
                        }
                    } else {
                        String str2 = clipsEditMetadataController.A0N;
                        if (str2 == null || (A00 = AbstractC54878OOt.A00(str2, list)) == null) {
                            textView2.setText(2131968670);
                            A0C(clipsEditMetadataController);
                            return;
                        }
                    }
                    textView2.setText(A00);
                    A0C(clipsEditMetadataController);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A08(ClipsEditMetadataController clipsEditMetadataController) {
        if (clipsEditMetadataController.A0v.A04(UserMonetizationProductType.A0E)) {
            if (clipsEditMetadataController.A03 != null) {
                A06(clipsEditMetadataController);
                return;
            }
            AbstractC59962oe abstractC59962oe = clipsEditMetadataController.A0q;
            IncentivePlatformApi incentivePlatformApi = clipsEditMetadataController.A1G;
            String str = clipsEditMetadataController.A13;
            C1ON A00 = AbstractC33656Eu6.A00(AbstractC25228BEl.A0q(incentivePlatformApi.A00), IGCreatorIncentiveProgramFetchEntryPoint.A0n, null, str);
            C50689MZh.A00(A00, clipsEditMetadataController, 35);
            abstractC59962oe.schedule(A00);
        }
    }

    public static final void A09(ClipsEditMetadataController clipsEditMetadataController) {
        CharSequence charSequence = (CharSequence) ((C50887MeI) clipsEditMetadataController.A1B.getValue()).A00.A02();
        if (charSequence != null && charSequence.length() != 0) {
            C1GL c1gl = clipsEditMetadataController.A0t;
            C121275eQ c121275eQ = new C121275eQ(new PUG(clipsEditMetadataController, 5), 457);
            c121275eQ.A00 = new EZ9(clipsEditMetadataController, 17);
            c1gl.schedule(c121275eQ);
            return;
        }
        A0A(clipsEditMetadataController);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|(2:6|(1:8))|9|(5:11|(1:19)|15|(1:17)|18)|20|(5:23|(2:26|24)|27|28|(1:30)(2:31|32))|34|(12:86|(1:88)|42|43|(10:55|(1:57)(1:81)|58|(1:60)|61|(1:(2:64|65)(2:75|76))(1:(1:78)(2:79|80))|66|(1:72)|73|74)|82|61|(0)(0)|66|(3:68|70|72)|73|74)(2:38|(1:40)(1:85))|41|42|43|(15:45|47|49|51|53|55|(0)(0)|58|(0)|61|(0)(0)|66|(0)|73|74)|82|61|(0)(0)|66|(0)|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0273, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0274, code lost:
    
        X.C0w9.A07("ClipsEditMetadataController", r2);
        X.C9GR.A0F(r40.A0q.getActivity(), "create_edits_metadata_io_exception", 2131961661);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a A[Catch: IOException -> 0x0273, TryCatch #0 {IOException -> 0x0273, blocks: (B:43:0x00ea, B:45:0x00f2, B:47:0x00f6, B:49:0x00fa, B:51:0x00fe, B:53:0x0102, B:55:0x0106, B:57:0x010a, B:58:0x010e, B:61:0x0117, B:65:0x016a, B:66:0x0246, B:68:0x0254, B:70:0x0258, B:72:0x025c, B:75:0x026e, B:76:0x0272, B:78:0x0122, B:79:0x0269), top: B:42:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0254 A[Catch: IOException -> 0x0273, TryCatch #0 {IOException -> 0x0273, blocks: (B:43:0x00ea, B:45:0x00f2, B:47:0x00f6, B:49:0x00fa, B:51:0x00fe, B:53:0x0102, B:55:0x0106, B:57:0x010a, B:58:0x010e, B:61:0x0117, B:65:0x016a, B:66:0x0246, B:68:0x0254, B:70:0x0258, B:72:0x025c, B:75:0x026e, B:76:0x0272, B:78:0x0122, B:79:0x0269), top: B:42:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(instagram.features.clips.edit.ClipsEditMetadataController r40) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0A(instagram.features.clips.edit.ClipsEditMetadataController):void");
    }

    public static final void A0B(ClipsEditMetadataController clipsEditMetadataController) {
        ShoppingCreationConfig shoppingCreationConfig;
        String str;
        C52094N2u c52094N2u = clipsEditMetadataController.A07;
        if (c52094N2u != null) {
            shoppingCreationConfig = c52094N2u.A01;
        } else {
            shoppingCreationConfig = null;
        }
        int i = 0;
        boolean A1W = AbstractC167007dF.A1W(shoppingCreationConfig);
        C56741PGj c56741PGj = (C56741PGj) clipsEditMetadataController.A0z;
        InterfaceC58158PqN interfaceC58158PqN = c56741PGj.A00;
        if (interfaceC58158PqN == null) {
            str = "viewHolder";
        } else {
            View Aqk = interfaceC58158PqN.Aqk();
            int i2 = 8;
            if (A1W) {
                i2 = 0;
            }
            Aqk.setVisibility(i2);
            Group group = clipsEditMetadataController.productTaggingGroup;
            if (group != null) {
                if (!A1W) {
                    i = 8;
                }
                group.setVisibility(i);
                if (A1W) {
                    c56741PGj.A01 = new C56740PGi(shoppingCreationConfig, clipsEditMetadataController);
                    clipsEditMetadataController.A0y.A01(clipsEditMetadataController.A0D);
                }
                A07(clipsEditMetadataController);
                return;
            }
            str = "productTaggingGroup";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (X.C14360o3.A0K(r1, r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (X.C14360o3.A0K(r1, r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (X.AbstractC50102Ry.A00(r1, r3.A02) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        if (X.C14360o3.A0K(r1, r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
    
        if (X.C14360o3.A0K(r1, r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x013e, code lost:
    
        if (r3.A0R == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(instagram.features.clips.edit.ClipsEditMetadataController r3) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0C(instagram.features.clips.edit.ClipsEditMetadataController):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r6.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0D(instagram.features.clips.edit.ClipsEditMetadataController r5, java.lang.String r6) {
        /*
            android.view.View r1 = r5.metaVerifiedAddLinkRow
            if (r1 == 0) goto L6a
            r0 = 19
            X.Ok6.A00(r1, r5, r6, r0)
            r4 = 0
            if (r6 == 0) goto L13
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L14
        L13:
            r0 = 1
        L14:
            r3 = 8
            android.widget.TextView r2 = r5.metaVerifiedAddLinkRowTitleTextView
            if (r0 != 0) goto L41
            if (r2 == 0) goto L67
            android.content.Context r1 = r5.A0n
            r0 = 2131955565(0x7f130f6d, float:1.9547661E38)
            X.AbstractC166987dD.A1P(r1, r2, r0)
            android.widget.TextView r0 = r5.metaVerifiedAddLinkRowSubtitleTextView
            if (r0 == 0) goto L64
            r0.setText(r6)
            android.widget.TextView r0 = r5.metaVerifiedAddLinkRowSubtitleTextView
            if (r0 == 0) goto L64
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowChevronIconView
            if (r0 == 0) goto L6d
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowClearButtonView
            if (r0 == 0) goto L61
            r0.setVisibility(r4)
            return
        L41:
            if (r2 == 0) goto L67
            android.content.Context r1 = r5.A0n
            r0 = 2131955564(0x7f130f6c, float:1.954766E38)
            X.AbstractC166987dD.A1P(r1, r2, r0)
            android.widget.TextView r0 = r5.metaVerifiedAddLinkRowSubtitleTextView
            if (r0 == 0) goto L64
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowChevronIconView
            if (r0 == 0) goto L6d
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.metaVerifiedAddLinkRowClearButtonView
            if (r0 == 0) goto L61
            r0.setVisibility(r3)
            return
        L61:
            java.lang.String r0 = "metaVerifiedAddLinkRowClearButtonView"
            goto L6f
        L64:
            java.lang.String r0 = "metaVerifiedAddLinkRowSubtitleTextView"
            goto L6f
        L67:
            java.lang.String r0 = "metaVerifiedAddLinkRowTitleTextView"
            goto L6f
        L6a:
            java.lang.String r0 = "metaVerifiedAddLinkRow"
            goto L6f
        L6d:
            java.lang.String r0 = "metaVerifiedAddLinkRowChevronIconView"
        L6f:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0D(instagram.features.clips.edit.ClipsEditMetadataController, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.AbstractC166987dD.A1b(r8) != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0E(instagram.features.clips.edit.ClipsEditMetadataController r7, java.util.List r8, java.util.List r9) {
        /*
            com.instagram.common.session.UserSession r3 = r7.A0s
            r5 = 0
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321069544449152(0x8109d2000f2480, double:3.0329288608930445E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r2 = r0 ^ 1
            r6 = 1
            if (r8 == 0) goto L1a
            boolean r1 = X.AbstractC166987dD.A1b(r8)
            r0 = 1
            if (r1 == r6) goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.String r4 = "Required value was null."
            if (r0 != 0) goto L29
            if (r9 == 0) goto L72
            boolean r0 = X.AbstractC166987dD.A1b(r9)
            if (r0 != r6) goto L72
            if (r2 == 0) goto L72
        L29:
            int r3 = X.AbstractC25231BEo.A0I(r8)
            if (r2 == 0) goto L34
            int r0 = X.AbstractC25231BEo.A0I(r9)
            int r3 = r3 + r0
        L34:
            android.widget.TextView r2 = r7.taggedPeopleTextView
            if (r2 == 0) goto L6d
            if (r3 != r6) goto L61
            if (r8 == 0) goto L4a
            java.lang.Object r0 = X.AbstractC001800i.A0O(r8, r5)
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            if (r0 == 0) goto L4a
            com.instagram.model.people.PeopleTag$UserInfo r0 = r0.A00
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L58
        L4a:
            if (r9 == 0) goto L5f
            java.lang.Object r0 = X.AbstractC001800i.A0O(r9, r5)
            com.instagram.model.fbusertag.FBUserTag r0 = (com.instagram.model.fbusertag.FBUserTag) r0
            if (r0 == 0) goto L5f
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r0.A02
            java.lang.String r0 = r0.A01
        L58:
            r2.setText(r0)
            r2.setVisibility(r5)
            return
        L5f:
            r0 = 0
            goto L58
        L61:
            android.content.Context r1 = r2.getContext()
            r0 = 2131969530(0x7f1345fa, float:1.9575985E38)
            java.lang.String r0 = X.AbstractC31177DnL.A0a(r1, r3, r0)
            goto L58
        L6d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L72:
            android.widget.TextView r1 = r7.taggedPeopleTextView
            if (r1 == 0) goto L7c
            r0 = 8
            r1.setVisibility(r0)
            return
        L7c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.edit.ClipsEditMetadataController.A0E(instagram.features.clips.edit.ClipsEditMetadataController, java.util.List, java.util.List):void");
    }

    public static final void A0F(ClipsEditMetadataController clipsEditMetadataController, boolean z) {
        String str;
        C54966OSw c54966OSw = clipsEditMetadataController.A0C;
        if (c54966OSw != null) {
            C54966OSw.A00(c54966OSw, 2131961962, 2131961933);
            return;
        }
        if (!clipsEditMetadataController.A0f && !AbstractC166987dD.A1b(clipsEditMetadataController.A0P)) {
            N60 n60 = clipsEditMetadataController.A11;
            FragmentActivity requireActivity = n60.requireActivity();
            UserSession A0r = AbstractC166987dD.A0r(n60.A07);
            ClipsEditMetadataController clipsEditMetadataController2 = n60.A01;
            if (clipsEditMetadataController2 == null) {
                str = "clipsEditMetadataController";
            } else {
                String str2 = clipsEditMetadataController2.A0N;
                String str3 = n60.A02;
                if (str3 == null) {
                    str = "mediaId";
                } else {
                    C14360o3.A0B(A0r, 1);
                    Bundle A05 = AbstractC31178DnM.A05(A0r);
                    A05.putString("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID", str2);
                    A05.putBoolean("ClipsConstants.ARG_CLIPS_SHOULD_SHOW_BONUSES_DEAL", z);
                    A05.putString("ClipsConstants.ARG_CLIPS_MEDIA_ID", str3);
                    AbstractC31171DnF.A0L(requireActivity, A05, A0r, ModalActivity.class, AbstractC111324zv.A00(2985)).A0A(requireActivity, 98);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C193328hC A0I = AbstractC31171DnF.A0I(clipsEditMetadataController.A0n);
        int i = 2131963887;
        if (z) {
            i = 2131963885;
        }
        A0I.A0A(i);
        int i2 = 2131963886;
        if (z) {
            i2 = 2131963884;
        }
        A0I.A09(i2);
        AbstractC31176DnK.A1W(A0I);
    }

    public static final void A0G(ClipsEditMetadataController clipsEditMetadataController, boolean z) {
        clipsEditMetadataController.A0c = z;
        clipsEditMetadataController.A1D.setIsLoading(z);
    }

    private final boolean A0H() {
        BrandedContentGatingInfoIntf brandedContentGatingInfoIntf;
        if (this.A0m == this.A0f && C14360o3.A0K(this.A15, this.A0P)) {
            C38321qM c38321qM = this.A0D;
            if (c38321qM != null) {
                brandedContentGatingInfoIntf = c38321qM.A0C.BQl();
            } else {
                brandedContentGatingInfoIntf = null;
            }
            if (C14360o3.A0K(brandedContentGatingInfoIntf, this.A04)) {
                BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = this.A05;
                if (brandedContentProjectMetadataIntf != null && !brandedContentProjectMetadataIntf.equals(this.A0i)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final View A0I() {
        View view = this.view;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("view");
        throw C00O.createAndThrow();
    }

    public final IgAutoCompleteTextView A0J() {
        IgAutoCompleteTextView igAutoCompleteTextView = this.A0J;
        if (igAutoCompleteTextView != null) {
            return igAutoCompleteTextView;
        }
        C14360o3.A0F("captionInputTextView");
        throw C00O.createAndThrow();
    }

    public final void A0K() {
        C56037Ou9 c56037Ou9 = this.A0j;
        if (c56037Ou9 == null) {
            C14360o3.A0F("locationSuggestionsRepository");
            throw C00O.createAndThrow();
        }
        c56037Ou9.A05.removeLocationUpdates(c56037Ou9.A03, c56037Ou9);
    }

    @Override // X.InterfaceC58040PoQ
    public final void D3I() {
        OWd oWd = this.locationSuggestionsRow;
        if (oWd != null) {
            C51143Mim c51143Mim = oWd.A04;
            c51143Mim.A00.clear();
            c51143Mim.notifyDataSetChanged();
            return;
        }
        C14360o3.A0F("locationSuggestionsRow");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQE() {
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A0q.requireActivity(), this.A0s);
        AbstractC69933Cc.A01();
        A0r.A0B(null, N5Z.A00(null, "CLIPS", null, -1L, true, false));
        A0r.A04();
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        AbstractC25651Mw.A00(this.A0s).A01(this.A1E, C55983OtG.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        AbstractC25651Mw.A00(this.A0s).A02(this.A1E, C55983OtG.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C14160ng c14160ng = this.A08;
        if (c14160ng != null) {
            c14160ng.cancel(true);
        }
        A0K();
        C56037Ou9 c56037Ou9 = this.A0j;
        if (c56037Ou9 == null) {
            C14360o3.A0F("locationSuggestionsRepository");
            throw C00O.createAndThrow();
        }
        c56037Ou9.A01();
        ClipsEditMetadataControllerLifecycleUtil.cleanupReferences(this);
        Map map = C51034Mgi.A00(this.A16).A04;
        map.remove("IS_ORIGINAL_MEDIA_PROMO_VIDEO");
        map.remove("IS_ORIGINAL_MEDIA_WELCOME_VIDEO");
        map.remove("IS_PROMO_VIDEO");
        map.remove("IS_ORIGINAL_MEDIA_CAPTIONS_ENABLED");
        map.remove("IS_CAPTIONS_ENABLED");
        map.remove("IS_EXCLUSIVE_CONTENT");
        map.remove("IS_CAPTIONS_TRANSLATIONS_ENABLED");
        map.remove("IS_CAPTIONS_TRANSLATIONS_TOGGLE_ENABLED");
        map.remove("IS_STICKER_TRANSLATIONS_ENABLED");
        map.remove("REEL_CONTAINS_STICKER_TRANSLATIONS");
        map.remove("IS_STICKER_TRANSLATIONS_TOGGLE_ENABLED");
        map.remove("IS_TRIAL_REEL");
        C8YE c8ye = this.A0K;
        if (c8ye != null) {
            c8ye.A05();
        }
        this.A0K = null;
    }

    public ClipsEditMetadataController(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C101394gx c101394gx, N60 n60, N60 n602, String str) {
        boolean A1a = AbstractC31175DnJ.A1a(userSession);
        this.A0q = abstractC59962oe;
        this.A11 = n60;
        this.A0s = userSession;
        this.A0r = interfaceC11380iw;
        this.A13 = str;
        this.A10 = n602;
        this.A0x = c101394gx;
        Context requireContext = abstractC59962oe.requireContext();
        this.A0n = requireContext;
        this.A1F = C1GJ.A01();
        this.A0t = C1GJ.A01();
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        this.A0v = A00;
        this.A0w = new C54813OKo(requireContext, userSession, A00);
        this.A1C = AbstractC167007dF.A1X(MSZ.A0h(userSession), C05F.A0C);
        this.A1G = AbstractC54041Nur.A00(userSession);
        this.A0u = AbstractC54040Nuq.A00(userSession);
        this.A1D = C56352iT.A0t.A03(abstractC59962oe.requireActivity());
        String A0j = AbstractC167017dG.A0j();
        this.A14 = A0j;
        this.A0y = C1XJ.A00.A04(null, interfaceC11380iw, userSession, A0j);
        this.A12 = new OBM(interfaceC11380iw, userSession, A0j);
        this.A0o = new Handler();
        this.A0z = C1XJ.A00.A0U(requireContext, AbstractC018607g.A00(abstractC59962oe), userSession);
        this.A19 = C57537PgB.A01(this, 40);
        this.A18 = C57537PgB.A01(this, 39);
        this.A1B = C57537PgB.A01(this, 42);
        this.A16 = C57537PgB.A01(this, 37);
        this.A1A = C57537PgB.A01(this, 41);
        this.A17 = C57537PgB.A01(this, 38);
        C16930sl c16930sl = C16930sl.A00;
        this.A0O = c16930sl;
        this.A0d = A1a;
        this.A15 = AbstractC166987dD.A1E();
        this.A0P = c16930sl;
        this.A0p = new C55346Oi6(this, 31);
        this.A1E = C56034Ou6.A00(this, 37);
        AbstractC37301Gc2.A0w(abstractC59962oe, ((C50994Mg1) this.A19.getValue()).A0A, new C30181DRm(this, 40), 47);
        AbstractC37301Gc2.A0w(abstractC59962oe, ((C50994Mg1) this.A19.getValue()).A08, new C30181DRm(this, 41), 47);
        AbstractC37301Gc2.A0w(abstractC59962oe, ((C50994Mg1) this.A19.getValue()).A09, new C30181DRm(this, 42), 47);
        AbstractC37301Gc2.A0w(abstractC59962oe, ((C50887MeI) this.A1B.getValue()).A00, new C30181DRm(this, 43), 47);
        AbstractC37301Gc2.A0w(abstractC59962oe, ((C50880MeB) this.A1A.getValue()).A00, new C30181DRm(this, 44), 47);
    }

    public static final String A00(ClipsEditMetadataController clipsEditMetadataController) {
        String obj;
        Editable text = clipsEditMetadataController.A0J().getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public static final void A07(ClipsEditMetadataController clipsEditMetadataController) {
        C52094N2u c52094N2u;
        List list;
        String A01;
        clipsEditMetadataController.A02();
        TextView textView = clipsEditMetadataController.A0h;
        if (textView != null && (c52094N2u = clipsEditMetadataController.A07) != null) {
            C54626OBb c54626OBb = c52094N2u.A00;
            if (c54626OBb != null) {
                list = c54626OBb.A02;
                A01 = c54626OBb.A00;
                if (A01 != null) {
                    if (c54626OBb.A03) {
                        A01 = clipsEditMetadataController.A0n.getString(2131968670);
                    }
                    textView.setText(A01);
                    A0C(clipsEditMetadataController);
                }
            } else {
                list = null;
            }
            String str = clipsEditMetadataController.A0N;
            if (str == null || list == null || (A01 = AbstractC54878OOt.A01(str, list)) == null) {
                textView.setText(2131968670);
                A0C(clipsEditMetadataController);
            }
            textView.setText(A01);
            A0C(clipsEditMetadataController);
        }
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQF(Venue venue) {
        C54778OIs c54778OIs;
        A05(venue, this);
        if (venue != null && (c54778OIs = this.A0A) != null) {
            c54778OIs.A00(venue);
        }
        A0K();
    }
}
