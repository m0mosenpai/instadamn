package com.instagram.creation.fragment;

import X.AbstractC018607g;
import X.AbstractC100604fP;
import X.AbstractC103794ly;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC199308rX;
import X.AbstractC2044893h;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC40091ta;
import X.AbstractC43591JPw;
import X.AbstractC43594JPz;
import X.AbstractC50595MVg;
import X.AbstractC50666MYj;
import X.AbstractC53242c7;
import X.AbstractC55229Oez;
import X.AbstractC82403m3;
import X.AbstractC86593tX;
import X.AnonymousClass001;
import X.AnonymousClass229;
import X.AnonymousClass471;
import X.C06090Tz;
import X.C0f9;
import X.C0fQ;
import X.C189448aO;
import X.C18U;
import X.C193328hC;
import X.C1DW;
import X.C1I2;
import X.C1ON;
import X.C1VW;
import X.C1XJ;
import X.C1YB;
import X.C22C;
import X.C22F;
import X.C22M;
import X.C23031Ai;
import X.C25671My;
import X.C33P;
import X.C37722Gix;
import X.C38321qM;
import X.C38801rC;
import X.C3DN;
import X.C3I7;
import X.C3I8;
import X.C3I9;
import X.C44547Jmr;
import X.C4hj;
import X.C50699MZu;
import X.C50763MbU;
import X.C51023MgV;
import X.C51685MsG;
import X.C52118N4q;
import X.C52234N9x;
import X.C53Z;
import X.C55346Oi6;
import X.C55962Osu;
import X.C55966Osy;
import X.C55983OtG;
import X.C55985OtI;
import X.C56021Ots;
import X.C56035Ou7;
import X.C56065Oui;
import X.C56177Owk;
import X.C56352iT;
import X.C56448P4j;
import X.C56450P4m;
import X.C56736PGe;
import X.C56813PJj;
import X.C56814PJk;
import X.C57012jc;
import X.C70399WUb;
import X.C75113Zb;
import X.C8YB;
import X.C8YE;
import X.C92584Cs;
import X.C92604Cu;
import X.C9GR;
import X.DialogInterfaceOnClickListenerC55319Ogh;
import X.DialogInterfaceOnDismissListenerC55324Ogm;
import X.EVO;
import X.EnumC124565kK;
import X.EnumC40111tc;
import X.EnumC50631MWs;
import X.InterfaceC02590Ai;
import X.InterfaceC101384gv;
import X.InterfaceC101404gy;
import X.InterfaceC102194ip;
import X.InterfaceC127465pP;
import X.InterfaceC19610xo;
import X.InterfaceC41501vz;
import X.InterfaceC43546JLg;
import X.InterfaceC56392iX;
import X.InterfaceC57959Pn5;
import X.InterfaceC57994Pne;
import X.InterfaceC60122ou;
import X.InterfaceC60152ox;
import X.InterfaceC60442pS;
import X.InterfaceC84473pq;
import X.KZH;
import X.MSW;
import X.MSX;
import X.NB5;
import X.OU6;
import X.OXN;
import X.OXs;
import X.OkD;
import X.PJV;
import X.ViewOnClickListenerC55460OkF;
import X.ViewOnClickListenerC55464OkJ;
import X.ViewOnLayoutChangeListenerC55476OkV;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class EditMediaInfoFragment extends C53Z implements InterfaceC60442pS, InterfaceC60122ou {
    public Location A01;
    public Handler A02;
    public Editable A03;
    public BrandedContentGatingInfoIntf A04;
    public BrandedContentProjectMetadataIntf A05;
    public MediaGenAIDetectionMethod A06;
    public C70399WUb A07;
    public InterfaceC56392iX A09;
    public InterfaceC56392iX A0A;
    public C44547Jmr A0B;
    public AddChannelsRowChannelInfo A0C;
    public C51685MsG A0D;
    public C51023MgV A0E;
    public C50699MZu A0F;
    public C56065Oui A0G;
    public KZH A0H;
    public C38321qM A0I;
    public C75113Zb A0J;
    public LocationSignalPackage A0K;
    public Venue A0L;
    public AudioOverlayTrack A0M;
    public C23031Ai A0N;
    public OXN A0O;
    public ProductCollectionFeedTaggingMeta A0P;
    public C8YE A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public boolean A0h;
    public boolean A0i;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public int A0v;
    public int A0w;
    public C3I9 A0x;
    public C57012jc A0y;
    public C57012jc A0z;
    public C57012jc A10;
    public C4hj A11;
    public OU6 A12;
    public ProductCollectionFeedTaggingMeta A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public ViewGroup mActionBar;
    public InterfaceC56392iX mAddAudioLabelStubber;
    public InterfaceC56392iX mAddGenAILabelStubber;
    public TextView mBelowUsernameLabel;
    public IgAutoCompleteTextView mCaption;
    public View mCommentPromptLabelView;
    public TextView mExtraLocationLabel;
    public View mFailedView;
    public ViewGroup mMediaTitleLayout;
    public ViewGroup mOptionsContainer;
    public View mPostOverlayView;
    public InterfaceC56392iX mReplaceAudioLabelStubber;
    public InterfaceC56392iX mReplaceGenAILabelStubber;
    public View mScrollView;
    public View mTextContainer;
    public TextView mTimestamp;
    public CircularImageView mUserImageView;
    public TextView mUsername;
    public TextView mUsernameAddCollaboratorsTextButton;
    public TextView mUsernameDotSeparator;
    public LinkedHashMap A0f = AbstractC166987dD.A1I();
    public ArrayList A0a = AbstractC166987dD.A1E();
    public String A0V = "";
    public ArrayList A0Y = AbstractC166987dD.A1E();
    public ArrayList A0X = AbstractC166987dD.A1E();
    public ArrayList A0Z = AbstractC166987dD.A1E();
    public HashMap A0d = AbstractC166987dD.A1G();
    public HashMap A0c = AbstractC166987dD.A1G();
    public HashMap A0e = AbstractC166987dD.A1G();
    public ArrayList A0W = AbstractC166987dD.A1E();
    public ArrayList A0b = AbstractC166987dD.A1E();
    public List A0g = AbstractC166987dD.A1E();
    public final List A1M = AbstractC166987dD.A1E();
    public final List A1B = AbstractC166987dD.A1E();
    public int A00 = 0;
    public final List A1C = AbstractC166987dD.A1E();
    public boolean A0j = false;
    public final InterfaceC60152ox A1J = new C56177Owk(this, 1);
    public final InterfaceC127465pP A1A = new C56448P4j(this, 0);
    public final InterfaceC57959Pn5 A1K = new C56450P4m(this);
    public final InterfaceC41501vz A1G = new C56035Ou7(this, 27);
    public final InterfaceC41501vz A1I = new C56035Ou7(this, 28);
    public final View.OnClickListener A18 = new ViewOnClickListenerC55460OkF(this, 58);
    public final View.OnClickListener A1E = new ViewOnClickListenerC55460OkF(this, 59);
    public final InterfaceC41501vz A1F = new C56035Ou7(this, 29);
    public final InterfaceC41501vz A1H = new C56035Ou7(this, 31);
    public InterfaceC41501vz A08 = new C56035Ou7(this, 30);
    public final View.OnLayoutChangeListener A19 = new ViewOnLayoutChangeListenerC55476OkV(this, 4);
    public final TextWatcher A1D = new C55346Oi6(this, 5);
    public final InterfaceC57994Pne A1L = new C56736PGe(this, 1);

    public static void A0J(EditMediaInfoFragment editMediaInfoFragment, boolean z) {
        Context requireContext = editMediaInfoFragment.requireContext();
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        OXs.A00(editMediaInfoFragment.requireActivity(), requireContext, editMediaInfoFragment, editMediaInfoFragment, editMediaInfoFragment.getSession(), c38321qM, z);
    }

    public static boolean A0S(List list, List list2) {
        boolean isEmpty;
        if (list == null) {
            if (list2 == null) {
                return false;
            }
            isEmpty = list2.isEmpty();
        } else {
            if (list2 == null) {
                return true;
            }
            ArrayList A1F = AbstractC166987dD.A1F(list);
            A1F.removeAll(list2);
            ArrayList A1F2 = AbstractC166987dD.A1F(list2);
            A1F2.removeAll(list);
            if (A1F.isEmpty()) {
                isEmpty = A1F2.isEmpty();
            }
        }
        return !isEmpty;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_media_info";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A02(View view, EditMediaInfoFragment editMediaInfoFragment) {
        ViewOnClickListenerC55464OkJ.A01(view, 63, new PJV(editMediaInfoFragment), editMediaInfoFragment);
        UserSession session = editMediaInfoFragment.getSession();
        String str = editMediaInfoFragment.A0R;
        str.getClass();
        AbstractC86593tX.A0e(EnumC124565kK.POST, editMediaInfoFragment.A06, session, null, "edit_media_info", "ig_gen_ai_self_disclosure_edit_impression", str.split("_")[0]);
    }

    public static void A03(ViewGroup viewGroup, EditMediaInfoFragment editMediaInfoFragment) {
        if (editMediaInfoFragment.A0n) {
            View requireViewById = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.promote_edit_caption_guidance_button, viewGroup).requireViewById(R.id.promote_edit_caption_guidance_button);
            C0fQ.A00(editMediaInfoFragment.A1E, requireViewById);
            requireViewById.setVisibility(0);
        }
    }

    public static void A04(EditMediaInfoFragment editMediaInfoFragment) {
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        if (c38321qM != null && c38321qM.A0C.AmB() != null) {
            Iterator it = editMediaInfoFragment.A0I.A0C.AmB().iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                String id = A0i.getId();
                id.getClass();
                if (!id.endsWith("open_carousel_prompt")) {
                    editMediaInfoFragment.A1B.add(A0i);
                    if (A0i.A0C.Bg6() == null) {
                        editMediaInfoFragment.A00++;
                    }
                }
            }
        }
    }

    public static void A05(EditMediaInfoFragment editMediaInfoFragment) {
        long j;
        C1VW c1vw = C1VW.A00;
        c1vw.getClass();
        c1vw.removeLocationUpdates(editMediaInfoFragment.getSession(), editMediaInfoFragment.A1A);
        c1vw.cancelSignalPackageRequest(editMediaInfoFragment.getSession(), editMediaInfoFragment.A1K);
        FragmentActivity requireActivity = editMediaInfoFragment.requireActivity();
        UserSession session = editMediaInfoFragment.getSession();
        Location location = editMediaInfoFragment.A01;
        LocationSignalPackage locationSignalPackage = editMediaInfoFragment.A0K;
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        if (c38321qM != null) {
            j = c38321qM.A1B();
        } else {
            j = -1;
        }
        NearbyVenuesService.A01(requireActivity, location, session, locationSignalPackage, Long.valueOf(j));
    }

    public static void A06(EditMediaInfoFragment editMediaInfoFragment) {
        editMediaInfoFragment.mCaption.getClass();
        editMediaInfoFragment.mCaption.clearFocus();
        AbstractC13880nE.A0O(editMediaInfoFragment.mCaption);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(com.instagram.creation.fragment.EditMediaInfoFragment r6) {
        /*
            X.1qM r0 = r6.A0I
            if (r0 == 0) goto Lb
            boolean r1 = X.AbstractC82403m3.A08(r0)
            r0 = 1
            if (r1 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 0
            if (r0 == 0) goto L6f
            X.1qM r0 = r6.A0I
            r0.getClass()
            X.1qM r0 = r6.A0I
            X.C14360o3.A0B(r0, r1)
            X.JLg r0 = X.AbstractC82403m3.A03(r0)
            if (r0 == 0) goto L6d
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.Bgl()
            if (r0 == 0) goto L6d
            com.instagram.user.model.User r5 = r0.BSW()
        L29:
            r5.getClass()
            X.8hC r4 = X.AbstractC31175DnJ.A0O(r6)
            r0 = 2131962388(0x7f132a14, float:1.95615E38)
            r4.A0A(r0)
            android.content.res.Resources r2 = X.AbstractC166997dE.A0N(r6)
            r1 = 2131961597(0x7f1326fd, float:1.9559895E38)
            r3 = 1
            X.17P r0 = r5.A03
            java.lang.String r0 = r0.getUsername()
            java.lang.String r0 = X.AbstractC166997dE.A0r(r2, r0, r1)
            r4.A0r(r0)
            r2 = 2131972171(0x7f13504b, float:1.9581342E38)
            r0 = 34
            X.Ogh r1 = X.DialogInterfaceOnClickListenerC55319Ogh.A00(r6, r0)
            X.8hE r0 = X.EnumC193348hE.A05
            r4.A0R(r1, r0, r2)
            r0 = 35
            X.Ogh r0 = X.DialogInterfaceOnClickListenerC55319Ogh.A00(r6, r0)
            r4.A0D(r0)
            r4.A0s(r3)
            r0 = 2
            X.DialogInterfaceOnCancelListenerC55251OfP.A00(r4, r6, r0)
            X.AbstractC166987dD.A1W(r4)
            return
        L6d:
            r5 = 0
            goto L29
        L6f:
            A0K(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A08(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    public static void A09(EditMediaInfoFragment editMediaInfoFragment) {
        C38321qM c38321qM;
        User user;
        ProductDetailsProductItemDictIntf Bgl;
        C38321qM c38321qM2 = editMediaInfoFragment.A0I;
        if (c38321qM2 != null && AbstractC82403m3.A08(c38321qM2) && (c38321qM = editMediaInfoFragment.A0I) != null) {
            InterfaceC43546JLg A03 = AbstractC82403m3.A03(c38321qM);
            if (A03 != null && (Bgl = A03.Bgl()) != null) {
                user = Bgl.BSW();
            } else {
                user = null;
            }
            user.getClass();
            A06(editMediaInfoFragment);
            C193328hC A0O = AbstractC31175DnJ.A0O(editMediaInfoFragment);
            A0O.A0A(2131974376);
            AbstractC31177DnL.A1A(editMediaInfoFragment, A0O, user.A03.getUsername(), 2131974377);
            A0O.A0H(null, 2131968948);
            AbstractC166987dD.A1W(A0O);
        }
    }

    public static void A0A(EditMediaInfoFragment editMediaInfoFragment) {
        if (!editMediaInfoFragment.A14 && !editMediaInfoFragment.A0o && editMediaInfoFragment.mCommentPromptLabelView == null) {
            editMediaInfoFragment.mCaption.getClass();
            editMediaInfoFragment.A14 = true;
            editMediaInfoFragment.mCaption.requestFocus();
            AbstractC13880nE.A0R(editMediaInfoFragment.mCaption);
            return;
        }
        A06(editMediaInfoFragment);
    }

    public static void A0B(EditMediaInfoFragment editMediaInfoFragment) {
        int right;
        int bottom;
        int width;
        if (editMediaInfoFragment.mMediaTitleLayout != null && editMediaInfoFragment.mTextContainer != null && editMediaInfoFragment.mTimestamp != null && editMediaInfoFragment.mUserImageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editMediaInfoFragment.A0T().getLayoutParams();
            if (AbstractC13620mo.A02(editMediaInfoFragment.requireContext())) {
                AbstractC13880nE.A0a(editMediaInfoFragment.A0T(), AbstractC167017dG.A04(editMediaInfoFragment.requireContext()));
                right = editMediaInfoFragment.mTimestamp.getWidth();
                bottom = editMediaInfoFragment.mMediaTitleLayout.getBottom();
                width = (MSX.A03(editMediaInfoFragment) - editMediaInfoFragment.mTextContainer.getRight()) + AbstractC166997dE.A0N(editMediaInfoFragment).getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            } else {
                right = editMediaInfoFragment.mUserImageView.getRight();
                bottom = editMediaInfoFragment.mMediaTitleLayout.getBottom();
                width = editMediaInfoFragment.mTimestamp.getWidth();
            }
            marginLayoutParams.setMargins(right, bottom, width, 0);
            TextView A0T = editMediaInfoFragment.A0T();
            A0T.setHighlightColor(0);
            A0T.setLayoutParams(marginLayoutParams);
            A0T.setVisibility(0);
            AbstractC31176DnK.A1G(A0T, editMediaInfoFragment.A00());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x010e, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(com.instagram.creation.fragment.EditMediaInfoFragment r12) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0C(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    public static void A0D(EditMediaInfoFragment editMediaInfoFragment) {
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(editMediaInfoFragment.A0N);
        A0w.E77("has_seen_boost_edit_caption_guidance_bottom_sheet", true);
        A0w.apply();
        A06(editMediaInfoFragment);
        C52118N4q c52118N4q = new C52118N4q();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("ARGUMENT_IS_MESSAGING_ADS_SELECTED", editMediaInfoFragment.A17);
        c52118N4q.setArguments(A0b);
        C189448aO A0y = AbstractC25225BEi.A0y(editMediaInfoFragment.getSession());
        AbstractC31172DnG.A1L(editMediaInfoFragment, A0y, 2131970851);
        A0y.A0g = editMediaInfoFragment.getString(2131970850);
        A0y.A0v = true;
        A0y.A1J = true;
        AbstractC31177DnL.A14(editMediaInfoFragment, c52118N4q, A0y);
    }

    public static void A0E(EditMediaInfoFragment editMediaInfoFragment) {
        View view;
        int i;
        if (editMediaInfoFragment.mReplaceAudioLabelStubber != null && editMediaInfoFragment.mAddAudioLabelStubber != null) {
            if (OXs.A02(editMediaInfoFragment.getSession(), editMediaInfoFragment.A0I)) {
                editMediaInfoFragment.mReplaceAudioLabelStubber.setVisibility(0);
                editMediaInfoFragment.mAddAudioLabelStubber.setVisibility(8);
                view = editMediaInfoFragment.mReplaceAudioLabelStubber.getView();
                View requireViewById = view.requireViewById(R.id.audio_unavailable_warning_icon);
                TextView A0T = AbstractC166997dE.A0T(view, R.id.audio_unavailable_text_label);
                C92584Cs A01 = C37722Gix.A01(editMediaInfoFragment.A0M);
                if (A01 != null) {
                    requireViewById.setVisibility(8);
                    A0T.setText(C92604Cu.A02(editMediaInfoFragment.requireContext(), editMediaInfoFragment.getSession(), A01));
                    i = 56;
                } else {
                    requireViewById.setVisibility(0);
                    A0T.setText(2131953329);
                    i = 57;
                }
            } else {
                boolean A012 = OXs.A01(editMediaInfoFragment.getSession(), editMediaInfoFragment.A0I);
                editMediaInfoFragment.mReplaceAudioLabelStubber.setVisibility(8);
                InterfaceC56392iX interfaceC56392iX = editMediaInfoFragment.mAddAudioLabelStubber;
                if (A012) {
                    interfaceC56392iX.setVisibility(0);
                    view = editMediaInfoFragment.mAddAudioLabelStubber.getView();
                    Context requireContext = editMediaInfoFragment.requireContext();
                    TextView A0T2 = AbstractC166997dE.A0T(view, R.id.add_audio_label);
                    C92584Cs A013 = C37722Gix.A01(editMediaInfoFragment.A0M);
                    if (A013 != null) {
                        A0T2.setText(C92604Cu.A02(requireContext, editMediaInfoFragment.getSession(), A013));
                        AbstractC31177DnL.A0z(A0T2, requireContext);
                        i = 50;
                    } else {
                        A0T2.setText(2131952322);
                        AbstractC166987dD.A1O(requireContext, A0T2, AbstractC53242c7.A0C(requireContext));
                        i = 51;
                    }
                } else {
                    interfaceC56392iX.setVisibility(8);
                    return;
                }
            }
            C0fQ.A00(new ViewOnClickListenerC55460OkF(editMediaInfoFragment, i), view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
    
        if (r3.A0r != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0F(com.instagram.creation.fragment.EditMediaInfoFragment r3) {
        /*
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L19
            X.2iT r2 = X.AbstractC31176DnK.A0J(r3)
            boolean r0 = r3.A0l
            if (r0 != 0) goto L10
            boolean r0 = r3.A0t
            if (r0 == 0) goto L15
        L10:
            boolean r1 = r3.A0r
            r0 = 1
            if (r1 == 0) goto L16
        L15:
            r0 = 0
        L16:
            r2.ARS(r0)
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0F(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    public static void A0G(EditMediaInfoFragment editMediaInfoFragment) {
        EnumC40111tc enumC40111tc;
        int i;
        String str;
        View view = editMediaInfoFragment.mView;
        if (view != null) {
            boolean z = editMediaInfoFragment.A0m;
            View view2 = editMediaInfoFragment.mFailedView;
            if (z) {
                if (view2 == null) {
                    View A0U = AbstractC167017dG.A0U(view, R.id.edit_media_failed_view_stub);
                    editMediaInfoFragment.mFailedView = A0U;
                    C0fQ.A00(new ViewOnClickListenerC55460OkF(editMediaInfoFragment, 54), ((ViewGroup) A0U).getChildAt(0));
                }
                FragmentActivity requireActivity = editMediaInfoFragment.requireActivity();
                Bundle bundle = editMediaInfoFragment.mArguments;
                if (bundle != null && bundle.containsKey("EditMediaFragment.ARGUMENT_MEDIA_TYPE")) {
                    enumC40111tc = AbstractC40091ta.A00(Integer.valueOf(bundle.getInt("EditMediaFragment.ARGUMENT_MEDIA_TYPE")));
                } else {
                    C38321qM c38321qM = editMediaInfoFragment.A0I;
                    if (c38321qM != null) {
                        enumC40111tc = c38321qM.BRp();
                    } else {
                        enumC40111tc = null;
                    }
                }
                if (enumC40111tc == EnumC40111tc.A0Q) {
                    i = 2131961586;
                    str = "edit_photo_failed";
                } else {
                    i = 2131961587;
                    str = "edit_video_failed";
                }
                C9GR.A01(requireActivity, str, i, 0);
                C56352iT.A0t.A03(requireActivity).A0T();
                return;
            }
            AbstractC167007dF.A0x(view2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0772, code lost:
    
        if (X.AbstractC81033jX.A03(r3) == false) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0H(final com.instagram.creation.fragment.EditMediaInfoFragment r28) {
        /*
            Method dump skipped, instructions count: 1911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0H(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    public static void A0I(EditMediaInfoFragment editMediaInfoFragment, C38321qM c38321qM) {
        if (c38321qM != null && editMediaInfoFragment.A0T != null && c38321qM.A0C.Ald() != null && c38321qM.A0C.Ald().BeJ() != null) {
            if (editMediaInfoFragment.A0T.equals(c38321qM.A0C.Ald().BeJ().getPollId())) {
                c38321qM.A0C.ERC(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x047c, code lost:
    
        if (X.AbstractC100604fP.A04(r4, false) != false) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0K(com.instagram.creation.fragment.EditMediaInfoFragment r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0K(com.instagram.creation.fragment.EditMediaInfoFragment, boolean):void");
    }

    public static void A0L(EditMediaInfoFragment editMediaInfoFragment, boolean z) {
        editMediaInfoFragment.A16 = z;
        if (editMediaInfoFragment.mView != null) {
            AbstractC31176DnK.A0J(editMediaInfoFragment).setIsLoading(editMediaInfoFragment.A16);
        }
    }

    public static boolean A0N(EditMediaInfoFragment editMediaInfoFragment) {
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        if (c38321qM != null && c38321qM.A0C.Ar6() != null && editMediaInfoFragment.A0I.A0C.Ar6().BqX() != null) {
            return true;
        }
        return false;
    }

    public static boolean A0O(EditMediaInfoFragment editMediaInfoFragment) {
        if (editMediaInfoFragment.A0I != null) {
            UserSession session = editMediaInfoFragment.getSession();
            if (C18U.A06(AbstractC166997dE.A0U(session), session, 2342156008514979427L)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0P(EditMediaInfoFragment editMediaInfoFragment) {
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        if (c38321qM == null || !c38321qM.A5F()) {
            C38321qM c38321qM2 = editMediaInfoFragment.A0I;
            if (c38321qM2 != null && c38321qM2.A0C.Ar6() != null && editMediaInfoFragment.A0I.A0C.AmB() != null && editMediaInfoFragment.A0I.A0C.AmB().size() > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean A0Q(EditMediaInfoFragment editMediaInfoFragment) {
        if (!editMediaInfoFragment.A0g.isEmpty() && !AbstractC166987dD.A10(editMediaInfoFragment.getSession()).A1O()) {
            return true;
        }
        return false;
    }

    public final TextView A0T() {
        TextView textView = this.mExtraLocationLabel;
        if (textView == null) {
            this.mView.getClass();
            TextView textView2 = (TextView) AbstractC167017dG.A0U(this.mView, R.id.extra_location_label_stub);
            this.mExtraLocationLabel = textView2;
            return textView2;
        }
        return textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (A0O(r13) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0U() {
        /*
            r13 = this;
            X.1qM r0 = r13.A0I
            r0.getClass()
            android.content.Context r1 = r13.requireContext()
            X.Nhv r0 = X.EnumC53319Nhv.A07
            X.ObH r3 = new X.ObH
            r3.<init>(r1, r0)
            com.instagram.common.session.UserSession r0 = r13.getSession()
            r3.A03(r0)
            r2 = 1
            r3.A0B = r2
            X.C55104ObH.A01(r13, r3)
            boolean r0 = A0R(r13)
            r3.A0J = r0
            X.1qM r0 = r13.A0I
            X.1rF r0 = r0.A0C
            java.lang.String r0 = r0.App()
            r3.A04 = r0
            boolean r0 = r13.A0M()
            if (r0 == 0) goto L45
            boolean r0 = A0P(r13)
            if (r0 != 0) goto L40
            boolean r1 = A0O(r13)
            r0 = 0
            if (r1 != 0) goto L41
        L40:
            r0 = 1
        L41:
            r3.A0I = r2
            r3.A0H = r0
        L45:
            boolean r0 = A0P(r13)
            if (r0 == 0) goto L67
            X.C55104ObH.A00(r13, r3)
        L4e:
            android.content.Intent r2 = r3.A02()
            com.instagram.common.session.UserSession r0 = r13.getSession()
            X.2hJ r1 = X.C55772hI.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            r1.A06(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            X.C12260kU.A06(r13, r2, r0)
            return
        L67:
            X.1qM r4 = r13.A0I
            java.util.ArrayList r6 = r13.A0a
            java.util.ArrayList r7 = r13.A0W
            java.util.ArrayList r8 = r13.A0b
            java.util.List r10 = r13.A0g
            java.util.ArrayList r11 = r13.A0Y
            java.util.ArrayList r12 = r13.A0X
            java.lang.String r5 = r13.A0V
            java.util.ArrayList r9 = r13.A0Z
            r3.A07(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A0U():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r3.A0r != false) goto L12;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            X.Ffp r2 = new X.Ffp
            r2.<init>()
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131961593(0x7f1326f9, float:1.9559887E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A02 = r0
            r1 = 55
            X.OkF r0 = new X.OkF
            r0.<init>(r3, r1)
            com.instagram.actionbar.ActionButton r2 = X.C31722DwR.A00(r0, r4, r2)
            boolean r0 = r3.A0m
            if (r0 == 0) goto L2b
            r0 = 8
            r2.setVisibility(r0)
            return
        L2b:
            boolean r0 = r3.A16
            r4.setIsLoading(r0)
            boolean r0 = r3.A0l
            if (r0 != 0) goto L38
            boolean r0 = r3.A0t
            if (r0 == 0) goto L3d
        L38:
            boolean r1 = r3.A0r
            r0 = 1
            if (r1 == 0) goto L3e
        L3d:
            r0 = 0
        L3e:
            r2.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.configureActionBar(X.2iU):void");
    }

    private SpannableString A00() {
        String string = getString(2131952312);
        if (this.A0u) {
            string = getString(2131952312);
        } else {
            Venue venue = this.A0L;
            if (venue == null) {
                C38321qM c38321qM = this.A0I;
                if (c38321qM != null && c38321qM.A27() != null) {
                    venue = this.A0I.A27();
                    this.A0L = venue;
                }
            }
            string = venue.A00.getName();
        }
        if (string == null) {
            string = "";
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C50763MbU(this, 0), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static void A01(Activity activity, EditMediaInfoFragment editMediaInfoFragment) {
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(2131961576);
        A0H.A0K(DialogInterfaceOnClickListenerC55319Ogh.A00(editMediaInfoFragment, 37), 2131968948);
        A0H.A0H(DialogInterfaceOnClickListenerC55319Ogh.A00(editMediaInfoFragment, 38), 2131953584);
        A0H.A0s(true);
        DialogInterfaceOnDismissListenerC55324Ogm.A00(A0H, editMediaInfoFragment, 7);
        AbstractC166987dD.A1W(A0H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (X.AbstractC13670mt.A0G(r2.A02(), r9.A0I.A0C.An4().C7K()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0146, code lost:
    
        if (A0S(r5.A3Q(), r2) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(com.instagram.creation.fragment.EditMediaInfoFragment r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.A07(com.instagram.creation.fragment.EditMediaInfoFragment):void");
    }

    private boolean A0M() {
        UserSession session;
        C06090Tz A0U;
        long j;
        if (A0N(this)) {
            C38321qM c38321qM = this.A0I;
            session = getSession();
            if (c38321qM != null) {
                return AbstractC100604fP.A04(session, this.A0I.A5P());
            }
            A0U = AbstractC166997dE.A0U(session);
            j = 36324913539592796L;
        } else {
            boolean A0P = A0P(this);
            session = getSession();
            A0U = AbstractC166997dE.A0U(session);
            if (A0P) {
                j = 36312999300957793L;
            } else {
                j = 36312999300826720L;
            }
        }
        return C18U.A06(A0U, session, j);
    }

    public static boolean A0R(EditMediaInfoFragment editMediaInfoFragment) {
        if (!A0N(editMediaInfoFragment)) {
            if (AbstractC199308rX.A01(editMediaInfoFragment.getSession()) && !A0Q(editMediaInfoFragment) && editMediaInfoFragment.A0O.A06()) {
                return true;
            }
            UserSession session = editMediaInfoFragment.getSession();
            C38321qM c38321qM = editMediaInfoFragment.A0I;
            ArrayList arrayList = editMediaInfoFragment.A0W;
            AbstractC167017dG.A1O(session, arrayList);
            if ((((c38321qM != null && c38321qM.A5r()) || AbstractC55229Oez.A0M(arrayList)) && AbstractC55229Oez.A0J(session, true)) || AbstractC55229Oez.A0K(session, true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        switch (i) {
            case 1000:
            case 1001:
                intent.getClass();
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
                ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = (ProductCollectionFeedTaggingMeta) intent.getParcelableExtra("tagged_collection_info");
                parcelableArrayListExtra.getClass();
                if (this.A0I != null && A0P(this)) {
                    HashSet A1H = AbstractC166987dD.A1H();
                    HashSet A1H2 = AbstractC166987dD.A1H();
                    Iterator it = parcelableArrayListExtra.iterator();
                    while (it.hasNext()) {
                        MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                        Object obj = this.A1B.get(mediaTaggingInfo.A01);
                        obj.getClass();
                        C38321qM c38321qM = (C38321qM) obj;
                        this.A0d.put(c38321qM.getId(), mediaTaggingInfo.A0B);
                        this.A0c.put(c38321qM.getId(), mediaTaggingInfo.A0A);
                        this.A0W.addAll(mediaTaggingInfo.A0F);
                        this.A0e.put(c38321qM.getId(), mediaTaggingInfo.A0C);
                        A1H.addAll(AbstractC166987dD.A1F(mediaTaggingInfo.A0E));
                        A1H2.addAll(AbstractC166987dD.A1F(mediaTaggingInfo.A09));
                    }
                    this.A0Y = AbstractC166987dD.A1F(A1H);
                    this.A0X = AbstractC166987dD.A1F(A1H2);
                    C75113Zb c75113Zb = this.A0J;
                    c75113Zb.getClass();
                    c75113Zb.A0B(intent.getIntExtra("last_page", 0));
                } else {
                    MediaTaggingInfo A0t = MSW.A0t(parcelableArrayListExtra, 0);
                    this.A0a = A0t.A0B;
                    this.A0Z = A0t.A0A;
                    this.A0W.addAll(A0t.A0F);
                    this.A0b = A0t.A0C;
                    if (!A0O(this)) {
                        this.A0V = A0t.A05;
                        this.A0Y = AbstractC166987dD.A1F(A0t.A0E);
                        this.A0X = AbstractC166987dD.A1F(A0t.A09);
                    }
                }
                this.A0P = productCollectionFeedTaggingMeta;
                A07(this);
                return;
            case 1002:
            default:
                return;
            case 1003:
                intent.getClass();
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("media_tagging_info_list");
                parcelableArrayListExtra2.getClass();
                if (this.A0I != null) {
                    MediaTaggingInfo A0t2 = MSW.A0t(parcelableArrayListExtra2, 0);
                    this.A0a = A0t2.A0B;
                    this.A0Z = A0t2.A0A;
                    this.A0W.addAll(A0t2.A0F);
                    this.A0V = A0t2.A05;
                    this.A0Y = AbstractC166987dD.A1F(A0t2.A0E);
                    this.A0X = AbstractC166987dD.A1F(A0t2.A09);
                }
                A07(this);
                return;
            case 1004:
                if (intent != null) {
                    this.A0M = (AudioOverlayTrack) intent.getParcelableExtra("extra_audio_track");
                    this.A0S = intent.getStringExtra(AbstractC43591JPw.A00(769));
                    if (this.A0M != null) {
                        this.A0l = true;
                        A0F(this);
                    }
                    String str2 = this.A0R;
                    if (str2 != null) {
                        AtomicBoolean atomicBoolean = C38321qM.A0i;
                        str = C38801rC.A06(str2);
                    } else {
                        str = null;
                    }
                    C22C A01 = AnonymousClass229.A01(getSession());
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_share_sheet_entity_impression");
                    if (A0f.isSampled()) {
                        MSX.A1E(A0f);
                        C22M c22m = ((C22F) A01).A04;
                        AbstractC166987dD.A1S(A0f, c22m.A0L);
                        AbstractC166997dE.A1N(A0f, "entity_type", 18);
                        AbstractC31171DnF.A1D(A0f, "edit_media_info");
                        AbstractC43594JPz.A1B(A0f, c22m);
                        MSW.A1M(EnumC50631MWs.A0L, A0f);
                        AbstractC37302Gc3.A0t(A0f);
                        AbstractC37300Gc1.A0h(A0f, C22F.A0F(str));
                        A0f.Cht();
                    }
                }
                AbstractC167017dG.A0y(getActivity(), C3DN.A00);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v81, types: [X.P2W, X.2xQ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int min;
        String str;
        BrandedContentTag brandedContentTag;
        int A02 = C0f9.A02(1118663305);
        Bundle requireArguments = requireArguments();
        super.onCreate(bundle);
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A01(this.A1I, C55985OtI.class);
        A00.A01(this.A1G, C55966Osy.class);
        A00.A01(this.A1F, C55962Osu.class);
        A00.A01(this.A1H, C56021Ots.class);
        A00.A01(this.A08, C55983OtG.class);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A0x = A01;
        A01.A9e(this.A1J);
        this.A0N = AbstractC23021Ah.A00(getSession());
        this.A07 = C70399WUb.A00(getSession());
        this.A02 = new Handler();
        if (bundle != null) {
            this.A0a = bundle.getParcelableArrayList("people_tags");
            this.A0V = bundle.getString("collaborator_id");
            this.A0Y = bundle.getStringArrayList("collaborator_ids");
            this.A0X = bundle.getStringArrayList("awaiting_response_collaborator_ids");
            this.A0Z = bundle.getParcelableArrayList("fb_user_tags");
            ArrayList arrayList = this.A0a;
            if (arrayList == null) {
                arrayList = AbstractC166987dD.A1E();
            }
            this.A0W = arrayList;
            this.A0b = bundle.getParcelableArrayList("product_tags");
            this.A0P = (ProductCollectionFeedTaggingMeta) bundle.getParcelable("tagged_collection_info");
            this.A0U = (String) bundle.getParcelable("alt_text");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("carousel_media_ids");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(AnonymousClass001.A0R("carousel_people_tags", A1B));
                    if (parcelableArrayList != null) {
                        this.A0d.put(A1B, parcelableArrayList);
                        this.A0W.addAll(parcelableArrayList);
                    }
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(AnonymousClass001.A0R("carousel_fb_user_tags", A1B));
                    if (parcelableArrayList2 != null) {
                        this.A0c.put(A1B, parcelableArrayList2);
                    }
                    ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(AnonymousClass001.A0R("carousel_product_tags", A1B));
                    if (parcelableArrayList3 != null) {
                        this.A0e.put(A1B, parcelableArrayList3);
                    }
                    Parcelable parcelable = bundle.getParcelable(AnonymousClass001.A0R("carousel_alt_text", A1B));
                    if (parcelable != null) {
                        this.A0f.put(A1B, parcelable);
                    }
                }
            }
            this.A0s = true;
            this.A0h = true;
            this.A0L = (Venue) bundle.getParcelable("venue");
            this.A0u = bundle.getBoolean("venue_cleared");
            this.A0M = (AudioOverlayTrack) bundle.getParcelable("updated_audio");
        }
        this.A0n = requireArguments.getBoolean("EditMediaFragment.ARGUMENT_IS_FROM_BOOST_EDITABLE_CAPTION");
        this.A0o = requireArguments.getBoolean("EditMediaFragment.ARGUMENT_IS_FROM_NEWSFEED");
        this.A17 = requireArguments.getBoolean("EditMediaFragment.ARGUMENT_IS_MESSAGING_ADS_SELECTED");
        this.A0C = (AddChannelsRowChannelInfo) requireArguments.getParcelable("EditMediaFragment.ARGUMENT_CHANNEL_TO_TAG_INFO");
        this.A0R = requireArguments.getString("EditMediaFragment.ARGUMENT_MEDIA_ID");
        C38321qM A022 = C1DW.A00(getSession()).A02(this.A0R);
        this.A0I = A022;
        if (A022 == null) {
            this.A0R.getClass();
            C1ON A04 = AbstractC2044893h.A04(getSession(), this.A0R);
            A04.A00 = new C52234N9x(this);
            schedule(A04);
        } else {
            if (!this.A0s) {
                A0C(this);
            }
            if (!this.A0h) {
                boolean A0P = A0P(this);
                C38321qM c38321qM = this.A0I;
                if (A0P) {
                    this.A0f = c38321qM.A3W();
                } else if (c38321qM.A0C.AXw() != null) {
                    this.A0U = this.A0I.A0C.AXw();
                }
            }
            A04(this);
            this.A0q = this.A0I.A5t();
            if (this.A0I.A58()) {
                for (InterfaceC102194ip interfaceC102194ip : this.A0I.A3r()) {
                    Boolean bool = Boolean.TRUE;
                    boolean equals = bool.equals(interfaceC102194ip.BcT());
                    boolean equals2 = bool.equals(interfaceC102194ip.Ca9());
                    this.A0g.add(new BrandedContentTag(interfaceC102194ip.BzF(), equals, equals2));
                    this.A1M.add(new BrandedContentTag(new BrandedContentTag(interfaceC102194ip.BzF(), equals, equals2)));
                }
                this.A05 = this.A0I.A0C.Ai4();
            }
            if (this.A0I.A0C.BQl() != null) {
                this.A04 = this.A0I.A0C.BQl();
            }
            this.A0E = (C51023MgV) MSW.A0F(new NB5(getSession()), requireActivity()).A00(C51023MgV.class);
            InterfaceC84473pq BGH = this.A0I.A0C.BGH();
            if (BGH != null) {
                this.A0E.A01(String.valueOf(BGH.Bg9()), BGH.getTitle(), BGH.BhQ(), BGH.BgA(), false);
                this.A0D = C51023MgV.A0D;
            }
            this.A0i = false;
            this.A0k = false;
            if (this.A0o) {
                A0J(this, true);
            }
            this.A06 = this.A0I.A1J();
        }
        this.A0F = AbstractC50666MYj.A00(getSession());
        this.A0w = requireArguments.getInt("EditMediaFragment.ARGUMENT_MEDIA_POSITION_IN_FEED", -1);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            min = 0;
        } else {
            min = Math.min(bundle2.getInt("EditMediaFragment.ARGUMENT_MEDIA_CAROUSEL_INDEX", 0), AbstractC25226BEj.A05(this.A1B));
        }
        this.A0v = min;
        this.A15 = requireArguments.getBoolean("EditMediaFragment.ARGUMENT_MEDIA_IS_CAROUSEL_BUMPED_POST", false);
        this.A11 = new C4hj(this);
        Context requireContext = requireContext();
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Context requireContext2 = requireContext();
        UserSession session = getSession();
        C38321qM c38321qM2 = this.A0I;
        ?? obj = new Object();
        obj.A00 = c38321qM2;
        this.A12 = new OU6(requireContext, getSession(), this.A11, new C33P(requireContext2, session, this, obj), this.A0n);
        C1XJ c1xj = C1XJ.A00;
        Context context = getContext();
        context.getClass();
        OXN A0I = c1xj.A0I(context, AbstractC018607g.A00(this), getSession(), this.A1L);
        this.A0O = A0I;
        if (!this.A0g.isEmpty() && (brandedContentTag = (BrandedContentTag) this.A0g.get(0)) != null) {
            str = brandedContentTag.A01;
        } else {
            str = null;
        }
        A0I.A04(str);
        registerLifecycleListener(new EVO(getActivity()));
        C0f9.A09(1215713838, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.8c6, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1008489550);
        View inflate = layoutInflater.inflate(R.layout.layout_edit_media_info, viewGroup, false);
        this.mScrollView = inflate.requireViewById(R.id.edit_media_scroll_view);
        this.mUserImageView = AbstractC31173DnH.A0T(inflate, R.id.edit_media_user_imageview);
        this.mUsername = AbstractC166997dE.A0T(inflate, R.id.edit_media_username);
        this.mUsernameDotSeparator = AbstractC166997dE.A0T(inflate, R.id.edit_media_username_separator);
        this.mUsernameAddCollaboratorsTextButton = AbstractC166997dE.A0T(inflate, R.id.edit_media_username_collaborators);
        this.mBelowUsernameLabel = AbstractC166997dE.A0T(inflate, R.id.below_username_label);
        this.mReplaceAudioLabelStubber = AbstractC37301Gc2.A0D(inflate, R.id.replace_audio_label_stub);
        this.mAddAudioLabelStubber = AbstractC37301Gc2.A0D(inflate, R.id.add_audio_label_stub);
        this.mReplaceGenAILabelStubber = AbstractC37301Gc2.A0D(inflate, R.id.replace_gen_ai_label_stub);
        this.mAddGenAILabelStubber = AbstractC37301Gc2.A0D(inflate, R.id.add_gen_ai_label_stub);
        this.mTimestamp = AbstractC166997dE.A0T(inflate, R.id.edit_media_timestamp);
        this.mTextContainer = inflate.requireViewById(R.id.edit_media_linear_layout);
        this.A0z = AbstractC31177DnL.A0U(inflate, R.id.single_media_group_stub);
        this.A0y = AbstractC31177DnL.A0U(inflate, R.id.carousel_media_group_stub);
        this.A10 = AbstractC31177DnL.A0U(inflate, R.id.upcoming_event_stub);
        this.A0A = AbstractC37301Gc2.A0D(inflate, R.id.tagged_channels_stub);
        this.A09 = AbstractC37301Gc2.A0D(inflate, R.id.bio_product_stub);
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) inflate.requireViewById(R.id.edit_media_caption);
        this.mCaption = igAutoCompleteTextView;
        igAutoCompleteTextView.addTextChangedListener(this.A1D);
        this.mCaption.getClass();
        this.mScrollView.getClass();
        C56065Oui c56065Oui = new C56065Oui(this, getSession(), this);
        this.A0G = c56065Oui;
        c56065Oui.A02(AbstractC31176DnK.A0J(this).A0S, new Object(), this.mCaption);
        this.mScrollView.addOnLayoutChangeListener(this.A19);
        this.mPostOverlayView = inflate.findViewById(R.id.content_overlay);
        C1YB A00 = C8YB.A00();
        UserSession session = getSession();
        C8YB.A00();
        this.A0Q = A00.A00((ViewStub) inflate.findViewById(R.id.warning_nudge), this, session, new C56813PJj(false), new C56814PJk(this, 1));
        A09(this);
        if (this.A0n && !this.A0N.A01.getBoolean("has_seen_boost_edit_caption_guidance_bottom_sheet", false)) {
            inflate.postDelayed(new Runnable() { // from class: X.PM8
                @Override // java.lang.Runnable
                public final void run() {
                    EditMediaInfoFragment.A0D(EditMediaInfoFragment.this);
                }
            }, 500L);
        }
        if (this.A0I != null && AbstractC50595MVg.A01(getSession()) && this.A0I.A0C.Ald() != null && this.A0I.A0C.Ald().BeJ() != null && this.A0I.A0C.Ald().BeJ().C5D() != null) {
            InterfaceC101404gy BeJ = this.A0I.A0C.Ald().BeJ();
            List C5D = BeJ.C5D();
            C5D.getClass();
            int size = C5D.size();
            ViewGroup viewGroup2 = (ViewGroup) AbstractC167017dG.A0U(inflate, R.id.poll_stub);
            this.mOptionsContainer = viewGroup2;
            ViewGroup A0F = AbstractC31173DnH.A0F(viewGroup2, R.id.option_rows);
            LayoutInflater A06 = AbstractC31175DnJ.A06(this);
            for (int i = 0; i < size; i++) {
                View inflate2 = A06.inflate(R.layout.comment_poll_consumption_option_row_unfilled, A0F, false);
                AbstractC13880nE.A0f(inflate2, AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material));
                View findViewById = inflate2.findViewById(R.id.option_row_text);
                findViewById.getClass();
                TextView textView = (TextView) findViewById;
                textView.setTextColor(AbstractC166997dE.A0N(this).getColor(AbstractC53242c7.A07(requireContext())));
                textView.setText(((InterfaceC101384gv) C5D.get(i)).getText());
                A0F.addView(inflate2);
            }
            View requireViewById = inflate.requireViewById(R.id.delete_poll);
            AbstractC166997dE.A18(requireContext(), requireViewById, 2131957694);
            OkD.A00(requireViewById, this, BeJ, size, 3);
        }
        C38321qM c38321qM = this.A0I;
        if (c38321qM != null && AnonymousClass471.A00(c38321qM) != null && this.mCaption != null) {
            View A0U = AbstractC167017dG.A0U(inflate, R.id.comment_prompt_stub);
            this.mCommentPromptLabelView = A0U;
            C0fQ.A00(new ViewOnClickListenerC55460OkF(this, 52), A0U);
            this.mCaption.setFocusable(false);
            C0fQ.A00(new ViewOnClickListenerC55460OkF(this, 53), this.mCaption);
        }
        C0f9.A09(-911550738, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(931004003);
        super.onDestroy();
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A02(this.A1I, C55985OtI.class);
        A00.A02(this.A1G, C55966Osy.class);
        A00.A02(this.A1F, C55962Osu.class);
        A00.A02(this.A1H, C56021Ots.class);
        A00.A02(this.A08, C55983OtG.class);
        C51023MgV c51023MgV = this.A0E;
        if (c51023MgV != null) {
            c51023MgV.A00();
        }
        C0f9.A09(66184387, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1496428916);
        super.onDestroyView();
        IgAutoCompleteTextView igAutoCompleteTextView = this.mCaption;
        if (igAutoCompleteTextView != null) {
            igAutoCompleteTextView.removeTextChangedListener(this.A1D);
            this.mCaption = null;
        }
        this.mUserImageView = null;
        this.mUsername = null;
        this.mUsernameDotSeparator = null;
        this.mUsernameAddCollaboratorsTextButton = null;
        this.mBelowUsernameLabel = null;
        this.mReplaceAudioLabelStubber = null;
        this.mAddAudioLabelStubber = null;
        this.mExtraLocationLabel = null;
        this.mTimestamp = null;
        this.mFailedView = null;
        this.A0z = null;
        this.A0y = null;
        C8YE c8ye = this.A0Q;
        if (c8ye != null) {
            c8ye.A05();
            this.A0Q = null;
        }
        this.mReplaceGenAILabelStubber = null;
        this.mAddGenAILabelStubber = null;
        C0f9.A09(-1209876219, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1066294855);
        super.onPause();
        AbstractC13880nE.A0O(this.mCaption);
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.removeLocationUpdates(getSession(), this.A1A);
            C1VW.A00.cancelSignalPackageRequest(getSession(), this.A1K);
        }
        C0f9.A09(1530373287, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-890600391);
        super.onResume();
        if (this.A0m) {
            A0G(this);
        } else {
            A0H(this);
            if (this.A01 == null) {
                C1VW c1vw = C1VW.A00;
                c1vw.getClass();
                Location lastLocation = c1vw.getLastLocation(getSession(), "EditMediaInfoFragment");
                if (lastLocation != null && AbstractC103794ly.A00(lastLocation)) {
                    this.A01 = lastLocation;
                    c1vw.removeLocationUpdates(getSession(), this.A1A);
                } else {
                    c1vw.requestLocationUpdates(getSession(), this.A1A, "EditMediaInfoFragment");
                }
            }
        }
        A0A(this);
        C0f9.A09(-1743298891, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("people_tags", this.A0a);
        bundle.putString("collaborator_id", this.A0V);
        bundle.putStringArrayList("collaborator_ids", this.A0Y);
        bundle.putStringArrayList("awaiting_response_collaborator_ids", this.A0X);
        bundle.putParcelableArrayList("fb_user_tags", this.A0Z);
        bundle.putParcelableArrayList("product_tags", this.A0b);
        bundle.putParcelable("tagged_collection_info", this.A0P);
        bundle.putParcelable("venue", this.A0L);
        bundle.putBoolean("venue_cleared", this.A0u);
        bundle.putParcelable("updated_audio", this.A0M);
        bundle.putCharSequence("alt_text", this.A0U);
        ArrayList A1F = AbstractC166987dD.A1F(this.A0d.keySet());
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            bundle.putParcelableArrayList(AnonymousClass001.A0R("carousel_people_tags", A1B), (ArrayList) this.A0d.get(A1B));
        }
        Iterator it2 = AbstractC166987dD.A1F(this.A0c.keySet()).iterator();
        while (it2.hasNext()) {
            String A1B2 = AbstractC166987dD.A1B(it2);
            bundle.putParcelableArrayList(AnonymousClass001.A0R("carousel_fb_user_tags", A1B2), (ArrayList) this.A0c.get(A1B2));
        }
        ArrayList A1F2 = AbstractC166987dD.A1F(this.A0e.keySet());
        Iterator it3 = A1F2.iterator();
        while (it3.hasNext()) {
            String A1B3 = AbstractC166987dD.A1B(it3);
            bundle.putParcelableArrayList(AnonymousClass001.A0R("carousel_product_tags", A1B3), (ArrayList) this.A0e.get(A1B3));
        }
        ArrayList A1F3 = AbstractC166987dD.A1F(this.A0f.keySet());
        Iterator it4 = A1F3.iterator();
        while (it4.hasNext()) {
            String A1B4 = AbstractC166987dD.A1B(it4);
            bundle.putCharSequence(AnonymousClass001.A0R("carousel_alt_text", A1B4), AbstractC31171DnF.A0h(A1B4, this.A0f));
        }
        ArrayList<String> A1E = AbstractC166987dD.A1E();
        A1E.addAll(A1F);
        A1E.addAll(A1F2);
        A1E.addAll(A1F3);
        bundle.putStringArrayList("carousel_media_ids", A1E);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-498051827);
        super.onStart();
        C3I9 c3i9 = this.A0x;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        C0f9.A09(1362601597, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(997291793);
        super.onStop();
        C3I9 c3i9 = this.A0x;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C0f9.A09(-1897397011, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Activity requireActivity = requireActivity();
        while (requireActivity.getParent() != null) {
            requireActivity = requireActivity.getParent();
        }
        Window window = requireActivity.getWindow();
        window.getClass();
        this.mActionBar = (ViewGroup) window.getDecorView().findViewById(R.id.action_bar_container);
        this.mMediaTitleLayout = (ViewGroup) view.findViewById(R.id.edit_media_relative_layout);
    }
}
