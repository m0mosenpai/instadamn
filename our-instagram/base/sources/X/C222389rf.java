package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.user.model.User;
import java.io.File;

/* renamed from: X.9rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222389rf extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelClipsShareFragment";
    public C9U0 A00;
    public C22P A01 = C22P.A5N;
    public ReelsVisualRepliesModel A02;
    public ClipsCelebrationReshareViewModel A03;
    public C38321qM A04;
    public PendingRecipient A05;
    public C8F8 A06;
    public File A07;
    public String A08;

    @Override // X.AbstractC67881V0m
    public final C81J A02(ViewGroup viewGroup) {
        boolean A06;
        C88513x8 c88513x8;
        float A0m;
        Bitmap A02;
        C14360o3.A0B(viewGroup, 0);
        C38321qM c38321qM = this.A04;
        if (c38321qM != null) {
            File file = this.A07;
            if (file == null) {
                C14360o3.A0F("file");
                throw C00O.createAndThrow();
            }
            Medium A03 = C8IU.A03(file, 3, 0);
            UserSession A0q = AbstractC166987dD.A0q(this);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A0q, 36323161192999983L)) {
                C23031Ai A00 = AbstractC23021Ah.A00(A0q);
                A06 = AbstractC167017dG.A1b(A00, A00.A6A, C23031Ai.A8c, 485);
            } else {
                A06 = C18U.A06(c06090Tz, A0q, 36323161193065520L);
            }
            User A2E = c38321qM.A2E(A0q);
            if (A2E != null) {
                User BAR = c38321qM.A0C.BAR();
                String A38 = c38321qM.A38();
                if (A38 != null) {
                    int A1C = (int) c38321qM.A1C();
                    C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
                    if (clipsMetadata != null) {
                        c88513x8 = clipsMetadata.F4J(C1DS.A00(A0q));
                    } else {
                        c88513x8 = null;
                    }
                    if (c38321qM.A1U() != null) {
                        A0m = r0.A01 / r0.A00;
                    } else {
                        A0m = c38321qM.A0m();
                    }
                    C83o c83o = new C83o(c88513x8, A2E, BAR, A38, A0m, 1.0f, 0, 0, A1C, A06, C18U.A06(c06090Tz, A0q, 36323161192803373L));
                    c83o.A03 = c38321qM;
                    Context requireContext = requireContext();
                    float A0A = AbstractC13880nE.A0A(requireContext);
                    float A09 = AbstractC13880nE.A09(requireContext);
                    RectF A0G = AbstractC167007dF.A0G(A0A, A09);
                    RectF A0Y = AbstractC166987dD.A0Y(A0A, A09);
                    C81J A01 = C81J.A01();
                    C81J.A0J(A01, this);
                    C81J.A0D(AbstractC166987dD.A0p(this), C81O.A02, A01, this);
                    A01.A09 = viewGroup;
                    A01.A0B = this.A01;
                    A01.A0O = this;
                    C81J.A05(A0G, A0Y, A01);
                    A01.A3y = true;
                    C81K c81k = C81K.A02;
                    A01.A0y = c81k;
                    A01.A3g = true;
                    A01.A0P = A03;
                    A01.A0w = null;
                    A01.A15 = c83o;
                    A01.A14 = this.A03;
                    A01.A0j = this.A02;
                    A01.A1T = this.A06;
                    A01.A3Q = true;
                    if (C18U.A06(c06090Tz, AbstractC166987dD.A0q(this), 36323161192541226L)) {
                        String str = this.A08;
                        if (str != null) {
                            File A11 = AbstractC166987dD.A11(str);
                            long currentTimeMillis = System.currentTimeMillis();
                            String canonicalPath = A11.getCanonicalPath();
                            Medium medium = new Medium(android.net.Uri.fromFile(A11), canonicalPath, 0, 1, 0, 0, AbstractC167007dF.A0E(canonicalPath, currentTimeMillis), currentTimeMillis);
                            A01.A1C = c38321qM;
                            A01.A00 = 0;
                            A01.A0P = medium;
                            A01.A0w = null;
                            A01.A0Q = A03;
                            A01.A3q = false;
                            if (C18U.A06(c06090Tz, AbstractC166987dD.A0q(this), 36323161192737836L)) {
                                Context context = getContext();
                                C81M c81m = null;
                                if (context != null && (A02 = C1NC.A02(context, medium.A02())) != null) {
                                    c81m = new AGv(context).A01();
                                    c81m.A0E = false;
                                    C8LG c8lg = new C8LG();
                                    c8lg.A02(A02.getPixel(0, 0), A02.getPixel(0, A02.getHeight() - 1));
                                    c81m.A0A = AbstractC166987dD.A1J(new TextColorScheme(c8lg));
                                    if (AbstractC166997dE.A1Z(c83o.A07.A02(), true)) {
                                        c81m.A02 = AbstractC167007dF.A09(context, R.attr.igds_color_media_background);
                                        c81m.A03 = 1;
                                        c81m.A01 = 1;
                                    }
                                }
                                A01.A0P = medium;
                                A01.A0w = c81m;
                            }
                        }
                    }
                    PendingRecipient pendingRecipient = this.A05;
                    if (pendingRecipient != null) {
                        A01.A1S = pendingRecipient;
                        A01.A0y = C81K.A05;
                        return A01;
                    }
                    A01.A0y = c81k;
                    return A01;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_clps_reshare_fragment";
    }

    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (C20Y.A00(AbstractC166987dD.A0p(this)).A01.A00 == C125535lz.A00) {
            UserSession userSession = super.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!AbstractC166997dE.A0c(c06090Tz, userSession, 36319828297981636L).booleanValue() && !C18U.A06(c06090Tz, AbstractC166987dD.A0q(this), 36328796189638446L)) {
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new C57159PZd(viewLifecycleOwner, c07s, this, null, 31), C07Y.A00(viewLifecycleOwner));
                C9U0 c9u0 = this.A00;
                if (c9u0 != null) {
                    c9u0.A00();
                }
            }
        }
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C22P c22p;
        int A02 = C0f9.A02(-1103153918);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get(MSV.A00(152));
        C8F8 c8f8 = null;
        if (!(obj instanceof C22P) || (c22p = (C22P) obj) == null) {
            c22p = C22P.A5N;
        }
        this.A01 = c22p;
        this.A04 = AbstractC167017dG.A0e(this, requireArguments.getString(MSV.A00(154)));
        String A00 = MSV.A00(153);
        String string = requireArguments.getString(A00);
        AbstractC153636vY.A03(requireArguments, string, A00);
        this.A07 = AbstractC166987dD.A11(string);
        this.A03 = (ClipsCelebrationReshareViewModel) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_SHARE_CELEBRATION_VIEW_MODEL");
        this.A00 = (C9U0) new C52942bb(new C215669gi(AbstractC166987dD.A0p(this)), this).A00(C9U0.class);
        this.A02 = (ReelsVisualRepliesModel) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_COMMENT_SHARE_MODEL");
        this.A05 = (PendingRecipient) requireArguments.getParcelable(MSV.A00(72));
        this.A08 = requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_BACKGROUND_FILE_PATH");
        String string2 = requireArguments.getString("ClipsConstants.ARG_CLIPS_ACHIEVEMENTS_STICKER_URL");
        if (string2 != null) {
            c8f8 = new C8F8(string2);
        }
        this.A06 = c8f8;
        PendingMediaStore A002 = C25A.A00(AbstractC166987dD.A0p(this));
        File file = this.A07;
        if (file == null) {
            C14360o3.A0F("file");
            throw C00O.createAndThrow();
        }
        String path = file.getPath();
        C14360o3.A07(path);
        A002.A08.add(path);
        C0f9.A09(151745034, A02);
    }
}
