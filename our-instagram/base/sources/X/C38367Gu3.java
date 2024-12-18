package X;

import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.FormattedString;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.ArrayList;

/* renamed from: X.Gu3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38367Gu3 extends C2UU {
    public C38321qM A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final HC2 A03;
    public final ArrayList A04;

    public C38367Gu3(InterfaceC11380iw interfaceC11380iw, UserSession userSession, HC2 hc2) {
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = hc2;
        this.A04 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    return new C39488HcG(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creator_viewer_insights_recipe_sheet_audio_item, false), this.A01, this.A02, this.A00, this.A03);
                }
                throw AbstractC25230BEn.A0n(AbstractC111324zv.A00(1845), i);
            }
            int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C39487HcF(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creator_viewer_insights_recipe_sheet_text_item, false), this.A01, this.A02, this.A00);
        }
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C39486HcE(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creator_viewer_insights_recipe_sheet_default_item, false), this.A01, this.A02, this.A00);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0ps, java.lang.Object] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        CreatorViewerSignalAudioDetails Adm;
        String str;
        AudioPageMetadata A01;
        boolean z;
        CreatorViewerSignalPlainDetails Bdg;
        String str2;
        Drawable drawable;
        CreatorViewerSignalReelsTextDetails Bm4;
        String str3;
        String str4;
        AbstractC38393GuU abstractC38393GuU = (AbstractC38393GuU) c3oo;
        C14360o3.A0B(abstractC38393GuU, 0);
        ArrayList arrayList = this.A04;
        if (abstractC38393GuU instanceof C39487HcF) {
            C39487HcF c39487HcF = (C39487HcF) abstractC38393GuU;
            C14360o3.A0B(arrayList, 0);
            CreatorViewerSignalModel creatorViewerSignalModel = (CreatorViewerSignalModel) AbstractC001800i.A0O(arrayList, i);
            if (creatorViewerSignalModel != null && (Bm4 = creatorViewerSignalModel.AxA().Bm4()) != null) {
                IgTextView igTextView = c39487HcF.A04;
                igTextView.setText("Aa");
                ClipsTextFormatType C6K = Bm4.C6K();
                if (C6K == null || (str3 = C6K.toString()) == null) {
                    str3 = "classic_v2";
                }
                int i2 = 0;
                EnumC190948cq enumC190948cq = AbstractC190898cl.A01(str3, null, false).A05;
                if (enumC190948cq != null) {
                    igTextView.setTypeface(AbstractC202838y1.A01(AbstractC15960qq.A00(AbstractC37301Gc2.A03(c39487HcF)), enumC190948cq));
                }
                c39487HcF.A03.setText(creatorViewerSignalModel.getTitle());
                IgTextView igTextView2 = c39487HcF.A02;
                FormattedString C3a = Bm4.C3a();
                if (C3a == null || (str4 = C3a.getText()) == null) {
                    str4 = "";
                }
                igTextView2.setText(Html.fromHtml(str4));
                CharSequence text = igTextView2.getText();
                C14360o3.A07(text);
                if (text.length() == 0) {
                    i2 = 8;
                }
                igTextView2.setVisibility(i2);
                C38321qM c38321qM = c39487HcF.A05;
                if (c38321qM != null) {
                    AbstractC37670Gi3.A0c(c39487HcF.A00, c39487HcF.A01, c38321qM, arrayList, i);
                    ViewOnClickListenerC42028Ijx.A00(c39487HcF.itemView, arrayList, c39487HcF, i, 14);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC38393GuU instanceof C39486HcE) {
            C39486HcE c39486HcE = (C39486HcE) abstractC38393GuU;
            C14360o3.A0B(arrayList, 0);
            CreatorViewerSignalModel creatorViewerSignalModel2 = (CreatorViewerSignalModel) AbstractC001800i.A0O(arrayList, i);
            if (creatorViewerSignalModel2 == null || (Bdg = creatorViewerSignalModel2.AxA().Bdg()) == null) {
                return;
            }
            String BEi = Bdg.BEi();
            if (BEi != null) {
                RoundedCornerImageView roundedCornerImageView = c39486HcE.A04;
                C17050sx A00 = C43203J8a.A00(c39486HcE, 6);
                try {
                    Integer A05 = AbstractC65877Tvg.A05(BEi);
                    if (A05 != null) {
                        drawable = AbstractC31172DnG.A05(c39486HcE).getDrawable(A05.intValue());
                    } else {
                        drawable = (Drawable) A00.getValue();
                    }
                } catch (Exception e) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append(AbstractC111324zv.A00(1626));
                    A1C.append(BEi);
                    AbstractC12120kG.A07("RecipeSheetDefaultItemViewHolderKt", AbstractC167017dG.A0n(e, AbstractC111324zv.A00(1470), A1C), null);
                    drawable = (Drawable) A00.getValue();
                }
                roundedCornerImageView.setImageDrawable(drawable);
            }
            IgTextView igTextView3 = c39486HcE.A02;
            FormattedString C3a2 = Bdg.C3a();
            if (C3a2 == null || (str2 = C3a2.getText()) == null) {
                str2 = "";
            }
            igTextView3.setText(Html.fromHtml(str2));
            float dimension = AbstractC25228BEl.A0M(c39486HcE.itemView).getDimension(R.dimen.ai_agent_share_profile_sticker_padding);
            RoundedCornerImageView roundedCornerImageView2 = c39486HcE.A04;
            roundedCornerImageView2.setRadius(dimension);
            roundedCornerImageView2.setStrokeEnabled(false);
            c39486HcE.A03.setText(creatorViewerSignalModel2.getTitle());
            CharSequence text2 = igTextView3.getText();
            C14360o3.A07(text2);
            int length = text2.length();
            int i3 = 0;
            if (length == 0) {
                i3 = 8;
            }
            igTextView3.setVisibility(i3);
            C38321qM c38321qM2 = c39486HcE.A05;
            if (c38321qM2 == null) {
                return;
            }
            AbstractC37670Gi3.A0c(c39486HcE.A00, c39486HcE.A01, c38321qM2, arrayList, i);
            ViewOnClickListenerC42028Ijx.A00(c39486HcE.itemView, arrayList, c39486HcE, i, 13);
            return;
        }
        C39488HcG c39488HcG = (C39488HcG) abstractC38393GuU;
        C14360o3.A0B(arrayList, 0);
        CreatorViewerSignalModel creatorViewerSignalModel3 = (CreatorViewerSignalModel) AbstractC001800i.A0O(arrayList, i);
        if (creatorViewerSignalModel3 == null || (Adm = creatorViewerSignalModel3.AxA().Adm()) == null) {
            return;
        }
        TrackOrOriginalSoundSchemaIntf Ads = Adm.Ads();
        if (Ads != null) {
            ?? obj = new Object();
            IgTextView igTextView4 = c39488HcG.A05;
            FormattedString C3a3 = Adm.C3a();
            if (C3a3 == null || (str = C3a3.getText()) == null) {
                str = "";
            }
            igTextView4.setText(Html.fromHtml(str));
            float dimension2 = AbstractC25228BEl.A0M(c39488HcG.itemView).getDimension(R.dimen.abc_button_padding_horizontal_material);
            RoundedCornerImageView roundedCornerImageView3 = c39488HcG.A08;
            roundedCornerImageView3.setRadius(dimension2);
            int i4 = 8;
            if (Ads.CA8() != null) {
                TrackData CA8 = Ads.CA8();
                if (CA8 != null) {
                    obj.A00 = CA8.getAudioClusterId();
                    ImageUrl AsE = CA8.AsE();
                    if (AsE != null) {
                        roundedCornerImageView3.setUrl(new SimpleImageUrl(AsE), c39488HcG.A02);
                    }
                    IgTextView igTextView5 = c39488HcG.A06;
                    String displayArtist = CA8.getDisplayArtist();
                    String str5 = "";
                    if (displayArtist == null) {
                        displayArtist = "";
                    }
                    String title = CA8.getTitle();
                    if (title != null) {
                        str5 = title;
                    }
                    String string = AbstractC25228BEl.A0M(c39488HcG.itemView).getString(2131964621, displayArtist, str5);
                    C14360o3.A07(string);
                    igTextView5.setText(string);
                    IgSimpleImageView igSimpleImageView = c39488HcG.A04;
                    TrackMetadata BTR = Ads.BTR();
                    if (BTR != null && AbstractC166997dE.A1Z(BTR.Cer(), true)) {
                        i4 = 0;
                    }
                    igSimpleImageView.setVisibility(i4);
                    TrackMetadata BTR2 = Ads.BTR();
                    if (BTR2 != null) {
                        z = BTR2.isBookmarked();
                    } else {
                        z = false;
                    }
                    A01 = AbstractC41763Iee.A03(CA8, z);
                    c39488HcG.A00 = A01;
                }
            } else if (Ads.BZv() != null) {
                OriginalSoundDataIntf BZv = Ads.BZv();
                if (BZv != null) {
                    obj.A00 = BZv.getAudioAssetId();
                    roundedCornerImageView3.setUrl(new SimpleImageUrl(BZv.BFU().Bhu()), c39488HcG.A02);
                    IgTextView igTextView6 = c39488HcG.A06;
                    String string2 = AbstractC25228BEl.A0M(c39488HcG.itemView).getString(2131964621, BZv.BFU().getUsername(), BZv.getOriginalAudioTitle());
                    C14360o3.A07(string2);
                    igTextView6.setText(string2);
                    IgSimpleImageView igSimpleImageView2 = c39488HcG.A04;
                    if (BZv.AqX().isTrendingInClips()) {
                        i4 = 0;
                    }
                    igSimpleImageView2.setVisibility(i4);
                    A01 = AbstractC41763Iee.A01(null, BZv, BZv.AqX().isBookmarked());
                    c39488HcG.A00 = A01;
                }
            }
            roundedCornerImageView3.A0E = new C42355IpH(c39488HcG, 2);
            UserSession userSession = c39488HcG.A03;
            if (C18U.A06(C06090Tz.A06, userSession, 36326996598798578L)) {
                InterfaceC56392iX A0D = AbstractC37301Gc2.A0D(c39488HcG.itemView, R.id.save_button_stub);
                A0D.getView().setVisibility(0);
                View view = A0D.getView();
                String str6 = (String) obj.A00;
                C52678NSa A002 = CK4.A00(userSession);
                boolean z2 = false;
                if (str6 != null) {
                    z2 = AbstractC37304Gc5.A1a(A002, str6, false);
                }
                view.setSelected(z2);
                if (obj.A00 != null) {
                    C0fQ.A00(new ViewOnClickListenerC41993IjO(obj, Ads, c39488HcG, arrayList, i, 7), A0D.getView());
                }
            }
        }
        c39488HcG.A07.setText(creatorViewerSignalModel3.getTitle());
        IgTextView igTextView7 = c39488HcG.A05;
        CharSequence text3 = igTextView7.getText();
        C14360o3.A07(text3);
        int length2 = text3.length();
        int i5 = 0;
        int i6 = 0;
        if (length2 == 0) {
            i6 = 8;
        }
        igTextView7.setVisibility(i6);
        ViewGroup viewGroup = c39488HcG.A01;
        CharSequence text4 = c39488HcG.A06.getText();
        C14360o3.A07(text4);
        if (text4.length() == 0) {
            i5 = 8;
        }
        viewGroup.setVisibility(i5);
        C38321qM c38321qM3 = c39488HcG.A09;
        if (c38321qM3 == null) {
            return;
        }
        AbstractC37670Gi3.A0c(c39488HcG.A02, c39488HcG.A03, c38321qM3, arrayList, i);
        ViewOnClickListenerC42028Ijx.A00(c39488HcG.itemView, arrayList, c39488HcG, i, 12);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-806301659);
        int size = this.A04.size();
        C0f9.A0A(125559602, A03);
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            r0 = -1699869895(0xffffffff9aae0b39, float:-7.1982844E-23)
            int r2 = X.C0f9.A03(r0)
            java.util.ArrayList r0 = r3.A04
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r4)
            com.instagram.api.schemas.CreatorViewerSignalModel r0 = (com.instagram.api.schemas.CreatorViewerSignalModel) r0
            if (r0 == 0) goto L2c
            com.instagram.api.schemas.CreatorViewerSignalDetails r1 = r0.AxA()
            if (r1 == 0) goto L2c
            com.instagram.api.schemas.CreatorViewerSignalAudioDetails r0 = r1.Adm()
            if (r0 == 0) goto L25
            r1 = 3
        L1e:
            r0 = -1685941699(0xffffffff9b82923d, float:-2.16012E-22)
            X.C0f9.A0A(r0, r2)
            return r1
        L25:
            com.instagram.api.schemas.CreatorViewerSignalPlainDetails r0 = r1.Bdg()
            r1 = 1
            if (r0 != 0) goto L1e
        L2c:
            r1 = 2
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38367Gu3.getItemViewType(int):int");
    }
}
