package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.transition.Fade;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.contentnotes.data.ContentNotesRepository$postNote$1;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView;
import com.instagram.direct.inbox.notes.creation.NotesCreationPogView;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.ui.widget.badgeicon.BadgeIconView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KBb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45466KBb extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "NotesCreationFragment";
    public int A00;
    public View.OnClickListener A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public CardView A07;
    public CardView A08;
    public CardView A09;
    public CardView A0A;
    public CardView A0B;
    public RecyclerView A0C;
    public EnumC25577BSp A0D;
    public C56352iT A0E;
    public InterfaceC41501vz A0F;
    public C66362zD A0G;
    public ImageUrl A0H;
    public IgEditText A0I;
    public IgEditText A0J;
    public IgLinearLayout A0K;
    public IgTextView A0L;
    public IgTextView A0M;
    public IgTextView A0N;
    public IgTextView A0O;
    public IgTextView A0P;
    public IgTextView A0Q;
    public IgTextView A0R;
    public IgImageView A0S;
    public IgImageView A0T;
    public IgImageView A0U;
    public IgImageView A0V;
    public InterfaceC56392iX A0W;
    public InterfaceC56392iX A0X;
    public InterfaceC56392iX A0Y;
    public InterfaceC56392iX A0Z;
    public InterfaceC56392iX A0a;
    public L5D A0b;
    public NotesCreationBubbleView A0c;
    public NotesCreationPogView A0d;
    public NoteAudienceItem A0e;
    public JYR A0f;
    public IgdsMediaButton A0g;
    public AudioOverlayTrack A0h;
    public BadgeIconView A0i;
    public Integer A0j;
    public Integer A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0z;
    public boolean A10;
    public boolean A12;
    public View A13;
    public CardView A14;
    public CardView A15;
    public IgdsSwitch A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public final InterfaceC09390do A1a = AbstractC25225BEi.A0a(new C50246MHb(this, 32), new C50246MHb(this, 19), new C50170MDx(30, null, this), AbstractC25225BEi.A1D(Jn6.class));
    public final InterfaceC09390do A1H = AbstractC25225BEi.A0a(new C50246MHb(this, 33), new C50246MHb(this, 18), new C50170MDx(31, null, this), AbstractC25225BEi.A1D(C25854Bc9.class));
    public final InterfaceC09390do A1G = AbstractC25225BEi.A0a(new C50246MHb(this, 34), new C50246MHb(this, 17), new C50170MDx(32, null, this), AbstractC25225BEi.A1D(C44524JmU.class));
    public String A0s = AbstractC167017dG.A0j();
    public final InterfaceC09390do A1K = AbstractC09440dt.A00(EnumC09460dv.A02, new C57262Pbk(null, this, "arg_immersive_content_notes_ui_state", 8));
    public final List A1F = AbstractC166987dD.A1E();
    public final InterfaceC09390do A1O = C50246MHb.A00(this, 25);
    public final InterfaceC09390do A1L = C50246MHb.A00(this, 22);
    public final InterfaceC09390do A1M = C50246MHb.A00(this, 23);
    public final InterfaceC09390do A1P = C50246MHb.A00(this, 26);
    public boolean A0y = true;
    public final View.OnClickListener A1X = new ViewOnClickListenerC48062LPn(this, 11);
    public boolean A11 = true;
    public final View.OnClickListener A1D = new ViewOnClickListenerC48062LPn(this, 19);
    public final InterfaceC58027PoD A1Z = new LXC(this, 1);
    public final View.OnClickListener A1Y = new ViewOnClickListenerC48062LPn(this, 20);
    public final InterfaceC09390do A1S = C50246MHb.A00(this, 29);
    public final InterfaceC09390do A1Q = C50246MHb.A00(this, 27);
    public final InterfaceC09390do A1R = C50246MHb.A00(this, 28);
    public final InterfaceC09390do A1T = C50246MHb.A00(this, 30);
    public final InterfaceC09390do A1U = C50246MHb.A00(this, 31);
    public final InterfaceC09390do A1N = C50246MHb.A00(this, 24);
    public final InterfaceC09390do A1I = C50246MHb.A00(this, 20);
    public final InterfaceC09390do A1J = C50246MHb.A00(this, 21);
    public final TextWatcher A1W = new LO2(this, 8);
    public final TextWatcher A1C = new LO2(this, 9);
    public final Handler A1B = AbstractC167007dF.A0J();
    public final M13 A1E = new M13(this);
    public final InterfaceC09390do A1V = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (X.AbstractC001900j.A05(r5, '@', r5.length() - 1) != (-1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(android.text.Editable r8, com.instagram.common.ui.base.IgEditText r9, X.C45466KBb r10) {
        /*
            r7 = 0
            if (r8 == 0) goto L5a
            java.lang.String r0 = r8.toString()
            int r6 = X.AbstractC13670mt.A00(r0)
            X.0do r1 = r10.A1V
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r1)
            int r0 = X.C4AC.A00(r0)
            int r6 = r6 - r0
            if (r6 <= 0) goto L56
            com.instagram.common.ui.base.IgEditText r0 = r10.A0J
            if (r0 != 0) goto L26
            java.lang.String r0 = "promptEditText"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L26:
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto L5b
            java.lang.String r5 = r8.toString()
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r1)
            r3 = 0
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r4, r3)
            r0 = 36316053022379948(0x810542000b0fac, double:3.029756392136567E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L5b
            r1 = 64
            X.C14360o3.A0B(r5, r3)
            int r0 = r5.length()
            int r0 = r0 + (-1)
            int r1 = X.AbstractC001900j.A05(r5, r1, r0)
            r0 = -1
            if (r1 == r0) goto L5b
        L56:
            java.lang.String r7 = r8.toString()
        L5a:
            return r7
        L5b:
            int r1 = r8.length()
            int r1 = r1 - r6
            int r0 = r8.length()
            android.text.Editable r8 = r8.delete(r1, r0)
            r9.setText(r8)
            X.AbstractC43592JPx.A1J(r9)
            if (r8 == 0) goto L5a
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.A03(android.text.Editable, com.instagram.common.ui.base.IgEditText, X.KBb):java.lang.String");
    }

    public static final void A0Q(C45466KBb c45466KBb, User user) {
        if (user.A2D()) {
            Number number = (Number) A02(c45466KBb).A0a.getValue();
            if (number != null) {
                int intValue = number.intValue();
                IgEditText igEditText = c45466KBb.A0I;
                if (igEditText != null) {
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(igEditText.getText());
                    A0H.replace(intValue + 1, A0H.length(), (CharSequence) user.getUsername()).setSpan(new StyleSpan(1), intValue, A0H.length(), 33);
                    A0H.append(' ');
                    igEditText.setText(A0H);
                    IgEditText igEditText2 = c45466KBb.A0I;
                    if (igEditText2 != null) {
                        AbstractC167017dG.A18(igEditText2);
                        Jn6 A02 = A02(c45466KBb);
                        InterfaceC169517hR interfaceC169517hR = A02.A01;
                        if (interfaceC169517hR != null) {
                            interfaceC169517hR.Eby(null);
                        }
                        A02.A09.Egh(null);
                        return;
                    }
                }
                C14360o3.A0F("noteEditText");
                throw C00O.createAndThrow();
            }
            return;
        }
        AbstractC35239FgY.A03(c45466KBb.requireContext(), AbstractC166987dD.A0r(c45466KBb.A1V), user, null, "notes", null, null);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "notes_creation_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Jn6 A02;
        super.onActivityResult(i, i2, intent);
        if (i == 8051) {
            String str = null;
            if (intent != null && intent.getData() != null && intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("pending_media_key");
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        z = extras2.getBoolean(AbstractC111324zv.A00(2625));
                    } else {
                        z = false;
                    }
                    Bundle extras3 = intent.getExtras();
                    if (extras3 != null) {
                        str = extras3.getString("file_path");
                    }
                    if (z && str != null) {
                        A02 = A02(this);
                        A02.A0Q.Egh(str);
                    } else {
                        A0S(this, "captured new video");
                        A02 = A02(this);
                        A02.A0R.Egh(intent.getData());
                        A02.A0S.Egh(string);
                    }
                    Jn6.A00(A02);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            return;
        }
        if (i != 1361) {
            return;
        }
        ImmutableList immutableList = C55083Oaf.A01;
        InterfaceC09390do interfaceC09390do = this.A1V;
        new C55083Oaf(AbstractC166987dD.A0r(interfaceC09390do)).A01(requireActivity(), intent, this.A1Z, AbstractC166987dD.A0r(interfaceC09390do), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01cd  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ImageUrl A01(C45466KBb c45466KBb) {
        InterfaceC09390do interfaceC09390do = c45466KBb.A1V;
        if (!C18U.A06(C06090Tz.A06, AbstractC166987dD.A0r(interfaceC09390do), 36324604301685001L)) {
            C08730cb c08730cb = C17060sy.A01;
            if (c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do)).A0D() != null) {
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36324604301619464L)) {
                    return c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do)).A0D();
                }
            }
        }
        return C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do)).Bhu();
    }

    public static final Jn6 A02(C45466KBb c45466KBb) {
        return (Jn6) c45466KBb.A1a.getValue();
    }

    public static final String A04(C45466KBb c45466KBb) {
        boolean z = c45466KBb.A0u;
        Context requireContext = c45466KBb.requireContext();
        InterfaceC09390do interfaceC09390do = c45466KBb.A1V;
        if (z) {
            return AbstractC92944En.A03(requireContext, AbstractC166987dD.A0r(interfaceC09390do));
        }
        return AbstractC92944En.A04(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A02(c45466KBb).A07(), AbstractC167007dF.A1X(A02(c45466KBb).A0E.getValue(), EnumC46184KcM.A07), A0d(c45466KBb), c45466KBb.A0w, AbstractC167007dF.A1X(A02(c45466KBb).A0E.getValue(), EnumC46184KcM.A03));
    }

    public static final void A07(View view, C45466KBb c45466KBb) {
        if (view != null) {
            AbstractC13880nE.A0O(view);
        }
        LBJ.A01(c45466KBb.getContext(), AbstractC166987dD.A0r(c45466KBb.A1V), EnumC46186KcO.A0D, "", AbstractC43592JPx.A18(c45466KBb, 24));
    }

    public static final void A09(EnumC46303KeZ enumC46303KeZ, C45466KBb c45466KBb) {
        InterfaceC09390do interfaceC09390do = c45466KBb.A1V;
        AbstractC135966Db.A01(AbstractC166987dD.A0r(interfaceC09390do)).A0C(enumC46303KeZ);
        AbstractC208269Jl.A00(AbstractC166987dD.A0r(interfaceC09390do)).A07(C22P.A3g, true);
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C6XJ A02 = C6XJ.A02(c45466KBb.getActivity(), AbstractC31178DnM.A06("arg_is_in_friend_map_mode", Boolean.valueOf(A0i(c45466KBb))), A0r, TransparentModalActivity.class, AbstractC111324zv.A00(3294));
        A02.A0J = ModalActivity.A07;
        A02.A0D(c45466KBb, 8051);
    }

    public static final void A0B(C45466KBb c45466KBb) {
        String str;
        View view = c45466KBb.A02;
        if (view == null) {
            str = "audiencePickerContainer";
        } else {
            AbstractC13880nE.A0O(view);
            FragmentActivity requireActivity = c45466KBb.requireActivity();
            UserSession A0r = AbstractC166987dD.A0r(c45466KBb.A1V);
            boolean A0d = A0d(c45466KBb);
            boolean A0i = A0i(c45466KBb);
            NoteAudienceItem noteAudienceItem = c45466KBb.A0e;
            if (noteAudienceItem == null) {
                str = "currentAudience";
            } else {
                C49623LwG c49623LwG = new C49623LwG(c45466KBb, 10);
                boolean A1Y = AbstractC25229BEm.A1Y(A0r);
                C45516KDh c45516KDh = new C45516KDh();
                c45516KDh.setArguments(AbstractC167017dG.A0T("is_friend_map", Boolean.valueOf(A0i), AbstractC166987dD.A1L("is_content_note", Boolean.valueOf(A0d))));
                C189448aO A0y = AbstractC25225BEi.A0y(A0r);
                A0y.A0d = requireActivity.getString(2131957005);
                C189458aP c189458aP = new C189458aP(null, null, "", A1Y ? 1 : 0, A1Y ? 1 : 0);
                c189458aP.A06 = requireActivity.getString(2131957006);
                c189458aP.A05 = new ViewOnClickListenerC48066LPr(60, c45516KDh, noteAudienceItem);
                A0y.A0Q = c189458aP.A00();
                A0y.A0U = c49623LwG;
                AbstractC31173DnH.A0w(requireActivity, c45516KDh, A0y);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0C(C45466KBb c45466KBb) {
        if (!c45466KBb.A0w) {
            View view = c45466KBb.A03;
            if (view == null) {
                C14360o3.A0F("avatarContainer");
                throw C00O.createAndThrow();
            }
            float[] A1b = AbstractC43592JPx.A1b();
            A1b[0] = view.getTranslationY();
            A1b[1] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", A1b);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
    }

    public static final void A0E(C45466KBb c45466KBb) {
        boolean z;
        Parcelable parcelable;
        NoteCreationSource noteCreationSource;
        NoteCreationSource noteCreationSource2;
        EnumC46160Kby enumC46160Kby = (EnumC46160Kby) A02(c45466KBb).A0e.getValue();
        int ordinal = enumC46160Kby.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1 && ordinal != 0) {
                return;
            }
            boolean A1X = AbstractC167007dF.A1X(enumC46160Kby, EnumC46160Kby.A04);
            C41451vu c41451vu = C41451vu.A01;
            C146106i8 A0K = AbstractC31171DnF.A0K();
            int i = 2131971030;
            if (A1X) {
                i = 2131971029;
            }
            A0K.A0D = c45466KBb.getString(i);
            A0K.A02();
            A0K.A07(R.drawable.instagram_error_pano_outline_24);
            AbstractC31178DnM.A1N(c41451vu, A0K);
            return;
        }
        NoteAudienceItem noteAudienceItem = c45466KBb.A0e;
        if (noteAudienceItem == null) {
            C14360o3.A0F("currentAudience");
            throw C00O.createAndThrow();
        }
        boolean A1W = AbstractC167007dF.A1W(A02(c45466KBb).A0W.getValue());
        boolean A1W2 = AbstractC167007dF.A1W(A02(c45466KBb).A0V.getValue());
        Bundle bundle = c45466KBb.mArguments;
        if (bundle != null) {
            z = bundle.getBoolean("arg_is_from_try_it");
        } else {
            z = false;
        }
        Bundle bundle2 = c45466KBb.mArguments;
        Parcelable parcelable2 = null;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable("arg_music_to_display");
        } else {
            parcelable = null;
        }
        if (parcelable instanceof AudioOverlayTrack) {
            parcelable2 = parcelable;
        }
        boolean z2 = !AbstractC166997dE.A1Z(parcelable2, false);
        if (!A1W && !A1W2) {
            String str = c45466KBb.A0n;
            if (str != null && str.length() != 0) {
                Jn6 A02 = A02(c45466KBb);
                String str2 = c45466KBb.A0n;
                if (str2 != null) {
                    String str3 = c45466KBb.A0p;
                    String str4 = c45466KBb.A0m;
                    if (str4 == null) {
                        str4 = "notes_creation_sheet";
                    }
                    EnumC25577BSp enumC25577BSp = c45466KBb.A0D;
                    if (enumC25577BSp == null) {
                        enumC25577BSp = EnumC25577BSp.UNKNOWN;
                    }
                    String str5 = c45466KBb.A0o;
                    String str6 = c45466KBb.A0q;
                    Integer num = c45466KBb.A0k;
                    String str7 = c45466KBb.A0l;
                    Integer num2 = c45466KBb.A0j;
                    String A0v = AbstractC25227BEk.A0v(c45466KBb, 2131968744);
                    ImageUrl imageUrl = c45466KBb.A0H;
                    C4F0 c4f0 = A02.A0N;
                    String str8 = A02.A05;
                    if (str8 == null) {
                        str8 = "";
                    }
                    if (C18U.A06(C06090Tz.A05, A02.A0M, 36323096769670114L)) {
                        str8 = new C11L("[\n\r\t]|\\\\[nrt]").A00(str8, " ");
                    }
                    NoteAudience noteAudience = noteAudienceItem.A00;
                    C14360o3.A0B(noteAudience, 3);
                    AbstractC166987dD.A1Z(new ContentNotesRepository$postNote$1(enumC25577BSp, imageUrl, c4f0, noteAudience, num, num2, str2, str8, str4, str5, str6, str7, A0v, str3, null, 2131966319), ((C4A7) c4f0).A01);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                Jn6 A022 = A02(c45466KBb);
                Context requireContext = c45466KBb.requireContext();
                if (c45466KBb.A0z) {
                    noteCreationSource2 = NoteCreationSource.A05;
                } else {
                    noteCreationSource2 = NoteCreationSource.A04;
                }
                A022.A05(requireContext, noteAudienceItem, noteCreationSource2, c45466KBb.A0s, C16930sl.A00, z, z2);
            }
            L5D l5d = c45466KBb.A0b;
            if (c45466KBb.A0w && l5d != null) {
                C47928LEx.A00((C47928LEx) c45466KBb.A1M.getValue(), l5d);
                AbstractC84973ql.A00(AbstractC166987dD.A0r(c45466KBb.A1V));
            }
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            if (A1W) {
                C47Z A03 = C25A.A00(AbstractC166987dD.A0r(c45466KBb.A1V)).A03((String) A02(c45466KBb).A0X.getValue());
                if (A03 == null) {
                    A03 = AbstractC209399Nx.A02(AbstractC43593JPy.A0x());
                    A03.A0g(String.valueOf(A02(c45466KBb).A0W.getValue()));
                    A03.A3L = A03.A3V;
                    A03.A0c(ShareType.A0c);
                    A03.A0N = 11;
                    A03.A02 = 1.0f;
                } else {
                    A03.A0c(ShareType.A0c);
                    A03.A0N = 11;
                }
                A03.A5F = true;
                A03.A0Y(new C40341u2());
                A1E.add(A03);
            }
            if (A1W2) {
                C47Z A01 = AbstractC209399Nx.A01(AbstractC43593JPy.A0x());
                String valueOf = String.valueOf(A02(c45466KBb).A0V.getValue());
                A01.A33 = valueOf;
                A01.A3L = valueOf;
                A01.A0c(ShareType.A0c);
                A01.A0N = 11;
                A01.A0Y(new C40341u2());
                A1E.add(A01);
            }
            Jn6 A023 = A02(c45466KBb);
            Context requireContext2 = c45466KBb.requireContext();
            if (c45466KBb.A0z) {
                noteCreationSource = NoteCreationSource.A05;
            } else {
                noteCreationSource = NoteCreationSource.A04;
            }
            A023.A05(requireContext2, noteAudienceItem, noteCreationSource, c45466KBb.A0s, A1E, z, z2);
        }
        AbstractC31177DnL.A13(c45466KBb);
        AbstractC84973ql.A00(AbstractC166987dD.A0r(c45466KBb.A1V));
    }

    public static final void A0F(C45466KBb c45466KBb) {
        if (!AbstractC167007dF.A1Z(c45466KBb.A1N) && c45466KBb.A0a()) {
            IgLinearLayout igLinearLayout = c45466KBb.A0K;
            if (igLinearLayout != null) {
                JQ0.A0G(igLinearLayout.animate(), 0.0f).withEndAction(new RunnableC49878M0x(c45466KBb)).start();
                return;
            }
        } else {
            IgLinearLayout igLinearLayout2 = c45466KBb.A0K;
            if (igLinearLayout2 != null) {
                igLinearLayout2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F("noteTypeEntryPointsLayout");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC43592JPx.A0T(r7, 0), 36321267113207069L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.C45466KBb r7) {
        /*
            android.view.View r6 = r7.A02
            if (r6 != 0) goto Le
            java.lang.String r3 = "audiencePickerContainer"
        L6:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            X.0do r0 = r7.A1N
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            r4 = 8
            r2 = 0
            if (r0 == 0) goto L2c
            com.instagram.common.session.UserSession r5 = X.AbstractC43592JPx.A0T(r7, r2)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321267113207069(0x810a000013251d, double:3.033053804171097E-306)
            boolean r1 = X.C18U.A06(r3, r5, r0)
            r0 = 8
            if (r1 != 0) goto L2d
        L2c:
            r0 = 0
        L2d:
            r6.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0C
            if (r0 == 0) goto L37
            r0.setVisibility(r4)
        L37:
            A0J(r7)
            boolean r0 = A0f(r7)
            if (r0 == 0) goto L47
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r7.A0g
            if (r0 == 0) goto L47
            r0.setVisibility(r2)
        L47:
            com.instagram.common.ui.base.IgTextView r0 = r7.A0O
            java.lang.String r3 = "mentionsDisclaimerTextView"
            if (r0 == 0) goto L6
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8c
            android.view.View r1 = r7.mView
            X.AbstractC43592JPx.A1T(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.UK3 r0 = new X.UK3
            r0.<init>()
            X.AbstractC66022TyK.A02(r1, r0)
            com.instagram.common.ui.base.IgTextView r0 = r7.A0O
            if (r0 == 0) goto L6
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r0 = r7.A0L
            java.lang.String r3 = "characterCounterTextView"
            if (r0 == 0) goto L6
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L8c
            X.Jn6 r0 = A02(r7)
            X.0UO r0 = r0.A0Y
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 == 0) goto L8c
            com.instagram.common.ui.base.IgTextView r0 = r7.A0L
            if (r0 == 0) goto L6
            r0.setVisibility(r2)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.A0G(X.KBb):void");
    }

    public static final void A0L(C45466KBb c45466KBb) {
        String str;
        EnumC46184KcM enumC46184KcM;
        IgEditText igEditText = c45466KBb.A0I;
        String str2 = "noteEditText";
        if (igEditText != null) {
            igEditText.requestFocus();
            c45466KBb.A0x = false;
            if (A0h(c45466KBb)) {
                A0N(c45466KBb);
                A0A(c45466KBb);
            }
            IgEditText igEditText2 = c45466KBb.A0I;
            if (igEditText2 == null) {
                str = "noteEditText";
            } else {
                igEditText2.setOnFocusChangeListener(null);
                IgEditText igEditText3 = c45466KBb.A0J;
                str = "promptEditText";
                if (igEditText3 != null) {
                    igEditText3.setOnFocusChangeListener(null);
                    View view = c45466KBb.A05;
                    if (view == null) {
                        str = "bubbleNestedScrollView";
                    } else {
                        view.setOnTouchListener(null);
                        IgEditText igEditText4 = c45466KBb.A0J;
                        if (igEditText4 != null) {
                            igEditText4.removeTextChangedListener(c45466KBb.A1C);
                            View view2 = c45466KBb.A03;
                            if (view2 == null) {
                                str2 = "avatarContainer";
                            } else {
                                A08(view2, Integer.valueOf(R.dimen.abc_dropdownitem_icon_width), null);
                                IgEditText igEditText5 = c45466KBb.A0J;
                                if (igEditText5 != null) {
                                    AbstractC31171DnF.A14(igEditText5);
                                    IgEditText igEditText6 = c45466KBb.A0J;
                                    if (igEditText6 != null) {
                                        igEditText6.setVisibility(8);
                                        IgImageView igImageView = c45466KBb.A0U;
                                        if (igImageView == null) {
                                            str2 = "promptXButton";
                                        } else {
                                            igImageView.setVisibility(8);
                                            IgImageView igImageView2 = c45466KBb.A0T;
                                            if (igImageView2 != null) {
                                                igImageView2.setVisibility(8);
                                            }
                                            IgTextView igTextView = c45466KBb.A0M;
                                            if (igTextView != null) {
                                                igTextView.setVisibility(8);
                                            }
                                            IgEditText igEditText7 = c45466KBb.A0I;
                                            if (igEditText7 != null) {
                                                igEditText7.requestFocus();
                                                IgEditText igEditText8 = c45466KBb.A0I;
                                                if (igEditText8 != null) {
                                                    AbstractC43592JPx.A1J(igEditText8);
                                                    IgEditText igEditText9 = c45466KBb.A0I;
                                                    if (igEditText9 != null) {
                                                        F3X.A00(igEditText9);
                                                        Jn6 A02 = A02(c45466KBb);
                                                        C05A c05a = A02.A0E;
                                                        if (c05a.getValue() == EnumC46184KcM.A09) {
                                                            enumC46184KcM = EnumC46184KcM.A05;
                                                        } else {
                                                            enumC46184KcM = EnumC46184KcM.A06;
                                                        }
                                                        c05a.Egh(enumC46184KcM);
                                                        A02.A06 = null;
                                                        Jn6.A00(A02);
                                                        IgEditText igEditText10 = c45466KBb.A0I;
                                                        if (igEditText10 != null) {
                                                            igEditText10.setHint(A04(c45466KBb));
                                                            A0O(c45466KBb);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final void A0M(C45466KBb c45466KBb) {
        String str;
        InterfaceC56392iX interfaceC56392iX = c45466KBb.A0Y;
        if (interfaceC56392iX == null) {
            str = "spotifyLoadingBubble";
        } else {
            interfaceC56392iX.setVisibility(8);
            IgEditText igEditText = c45466KBb.A0I;
            if (igEditText == null) {
                str = "noteEditText";
            } else {
                igEditText.setVisibility(0);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0O(C45466KBb c45466KBb) {
        NotesCreationBubbleView notesCreationBubbleView = c45466KBb.A0c;
        String str = "bubbleView";
        if (notesCreationBubbleView != null) {
            notesCreationBubbleView.getLayoutParams().width = -2;
            NotesCreationBubbleView notesCreationBubbleView2 = c45466KBb.A0c;
            if (notesCreationBubbleView2 != null) {
                AbstractC43592JPx.A1G(notesCreationBubbleView2.A00, -2);
                NotesCreationBubbleView notesCreationBubbleView3 = c45466KBb.A0c;
                if (notesCreationBubbleView3 != null) {
                    AbstractC43592JPx.A1F(notesCreationBubbleView3.A00, -2);
                    IgEditText igEditText = c45466KBb.A0I;
                    str = "noteEditText";
                    if (igEditText != null) {
                        AbstractC43592JPx.A1G(igEditText, -2);
                        IgEditText igEditText2 = c45466KBb.A0I;
                        if (igEditText2 != null) {
                            Editable text = igEditText2.getText();
                            if (text != null && text.length() != 0) {
                                IgEditText igEditText3 = c45466KBb.A0I;
                                if (igEditText3 != null) {
                                    igEditText3.setHint("");
                                }
                            }
                            C152716tz c152716tz = C152716tz.A00;
                            IgEditText igEditText4 = c45466KBb.A0I;
                            if (igEditText4 != null) {
                                c152716tz.A04(igEditText4, new C50246MHb(c45466KBb, 35), false, true);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0P(C45466KBb c45466KBb, AudioOverlayTrack audioOverlayTrack, boolean z) {
        if (audioOverlayTrack != null) {
            InterfaceC09390do interfaceC09390do = c45466KBb.A1V;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C47363KwC c47363KwC = new C47363KwC(c45466KBb);
            Jn6 A02 = A02(c45466KBb);
            AbstractC167007dF.A1F(A0r, 0, A02);
            Bundle A05 = AbstractC31178DnM.A05(A0r);
            A05.putBoolean("is_existing_track", z);
            A05.putParcelable("selected_audio_track", audioOverlayTrack);
            KDB kdb = new KDB();
            kdb.setArguments(A05);
            kdb.A00 = c47363KwC;
            kdb.A01 = A02;
            C189448aO A0y = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(interfaceC09390do));
            A0y.A0T = kdb;
            A0y.A0U = new C49623LwG(c45466KBb, 12);
            AbstractC31177DnL.A14(c45466KBb, kdb, A0y);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    public static final void A0R(C45466KBb c45466KBb, String str) {
        AnonymousClass229.A01(AbstractC31176DnK.A0S(c45466KBb)).A03.A07(str);
        IgEditText igEditText = c45466KBb.A0I;
        Object obj = null;
        if (igEditText == null) {
            C14360o3.A0F("noteEditText");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(igEditText);
        ?? obj2 = new Object();
        C15370ps A1F = AbstractC25225BEi.A1F();
        C45127Jxw c45127Jxw = (C45127Jxw) A02(c45466KBb).A0c.getValue();
        if (c45127Jxw != null) {
            obj = c45127Jxw.A00;
        }
        A1F.A00 = obj;
        ?? obj3 = new Object();
        Context requireContext = c45466KBb.requireContext();
        UserSession A0r = AbstractC166987dD.A0r(c45466KBb.A1V);
        EnumC1810381f enumC1810381f = EnumC1810381f.A05;
        ImmutableList A0M = AbstractC43594JPz.A0M();
        C48630Lf6 c48630Lf6 = new C48630Lf6(c45466KBb, obj2, obj3, A1F);
        C48628Lf4 c48628Lf4 = new C48628Lf4(c45466KBb, obj3, obj2, A1F);
        new C8BP(requireContext, C8BN.CHOOSE_MUSIC_ON_NOTES, A0M, MusicProduct.A0H, c45466KBb, A0r, null, null, null, c48628Lf4, c48630Lf6, null, C8BO.A09, enumC1810381f, null, false, true, false, !C1H6.A03(), c45466KBb.A0Y()).A0A(null, null, false, false);
    }

    public static final void A0S(C45466KBb c45466KBb, String str) {
        JYR jyr = c45466KBb.A0f;
        if (jyr != null) {
            jyr.A02(AbstractC43592JPx.A10("notes_creation_sheet", str));
        }
        c45466KBb.A0f = null;
    }

    public static final void A0T(C45466KBb c45466KBb, List list) {
        AbstractC13880nE.A0O(c45466KBb.mView);
        C3DN A0l = AbstractC43593JPy.A0l(c45466KBb, C3DN.A00);
        if (A0l != null) {
            FG6 fg6 = new FG6(c45466KBb);
            C33152Ejv c33152Ejv = new C33152Ejv();
            c33152Ejv.A02 = fg6;
            if (list == null) {
                list = C16930sl.A00;
            }
            c33152Ejv.A03 = list;
            A0l.A0K(c33152Ejv);
        }
    }

    public static final void A0W(C45466KBb c45466KBb, boolean z) {
        String str;
        InterfaceC56392iX interfaceC56392iX = c45466KBb.A0Z;
        if (interfaceC56392iX == null) {
            str = "spotifyMusicBubble";
        } else {
            interfaceC56392iX.setVisibility(8);
            InterfaceC56392iX interfaceC56392iX2 = c45466KBb.A0a;
            str = "spotifyPlaceholderBubble";
            if (interfaceC56392iX2 != null) {
                interfaceC56392iX2.setVisibility(0);
                A0M(c45466KBb);
                InterfaceC56392iX interfaceC56392iX3 = c45466KBb.A0a;
                if (interfaceC56392iX3 != null) {
                    TextView A0e = AbstractC166987dD.A0e(interfaceC56392iX3.getView(), R.id.share_from_spotify_title);
                    int A03 = AbstractC167017dG.A03(c45466KBb.requireContext());
                    Drawable A05 = C3LQ.A05(c45466KBb.requireContext(), R.drawable.instagram_app_spotify_pano_filled_24, c45466KBb.requireContext().getColor(AbstractC31174DnI.A05(c45466KBb)));
                    int i = 179;
                    if (z) {
                        i = 255;
                    }
                    A05.setAlpha(i);
                    A05.setBounds(0, 0, A03, A03);
                    if (A0e != null) {
                        Resources A0N = AbstractC166997dE.A0N(c45466KBb);
                        int i2 = 2131965285;
                        if (z) {
                            i2 = 2131965287;
                        }
                        AbstractC31173DnH.A19(A0N, A0e, i2);
                        A0e.setCompoundDrawablePadding(AbstractC167017dG.A05(c45466KBb.requireContext()));
                        A0e.setCompoundDrawables(A05, null, null, null);
                        float f = 0.3f;
                        if (z) {
                            f = 1.0f;
                        }
                        A0e.setAlpha(f);
                    }
                    IgTextView igTextView = c45466KBb.A0M;
                    if (igTextView != null) {
                        if (!z) {
                            AbstractC31176DnK.A1G(igTextView, AbstractC92944En.A00(c45466KBb.requireContext(), AbstractC166987dD.A0r(c45466KBb.A1V), true, false));
                            igTextView.setVisibility(0);
                            return;
                        } else {
                            igTextView.setVisibility(8);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0d(X.C45466KBb r1) {
        /*
            java.lang.String r0 = r1.A0n
            if (r0 == 0) goto Lb
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.A0d(X.KBb):boolean");
    }

    public static final boolean A0e(C45466KBb c45466KBb) {
        if (c45466KBb.A0w) {
            UserSession A0r = AbstractC166987dD.A0r(c45466KBb.A1V);
            if (C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36323096769801188L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0f(C45466KBb c45466KBb) {
        if (!c45466KBb.A0w && !A0i(c45466KBb)) {
            UserSession A0r = AbstractC166987dD.A0r(c45466KBb.A1V);
            if (C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36329418959896905L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0g(C45466KBb c45466KBb) {
        if (!c45466KBb.A17 && !c45466KBb.A0z && !A0d(c45466KBb) && !A0i(c45466KBb) && !AbstractC167007dF.A1Z(c45466KBb.A1N) && !c45466KBb.A0x) {
            UserSession A0r = AbstractC166987dD.A0r(c45466KBb.A1V);
            if (C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36328628685913789L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0i(C45466KBb c45466KBb) {
        if (c45466KBb.A1I.getValue() == null && c45466KBb.A1J.getValue() == null) {
            return false;
        }
        return true;
    }

    public final UserSession A0j() {
        return AbstractC166987dD.A0r(this.A1V);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A1V);
    }

    public static final SpannableStringBuilder A00(C45466KBb c45466KBb, String str, boolean z) {
        Drawable drawable;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        if (z) {
            drawable = c45466KBb.requireContext().getDrawable(R.drawable.music_explicit);
        } else {
            drawable = null;
        }
        int color = c45466KBb.requireContext().getColor(AbstractC53242c7.A0B(c45466KBb.getContext()));
        int A0E = AbstractC167017dG.A0E(c45466KBb.requireContext());
        if (drawable != null) {
            drawable.setBounds(0, 0, A0E, A0E);
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
        }
        A01.append((CharSequence) str);
        if (z && drawable != null) {
            C4GL.A02(drawable, A01, A01.length(), 16, 16);
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r4.length() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        r1 = r2 ^ 1;
        r0 = r10.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        X.C14360o3.A0F("noteEditText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        r0.setGravity(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        if (r4 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(android.text.Editable r8, com.instagram.common.ui.base.IgEditText r9, X.C45466KBb r10) {
        /*
            java.lang.String r4 = A03(r8, r9, r10)
            X.Jn6 r8 = A02(r10)
            java.lang.String r2 = r8.A05
            r0 = 0
            if (r4 == 0) goto Le6
            java.lang.String r1 = X.AbstractC25228BEl.A1A(r4)
        L11:
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 != 0) goto L73
            if (r4 == 0) goto Le3
            java.lang.String r1 = X.AbstractC25228BEl.A1A(r4)
        L1d:
            r8.A05 = r1
            X.Jn6.A00(r8)
            java.lang.String r1 = r8.A05
            X.Jn6.A01(r8, r1)
            if (r4 == 0) goto L73
            X.05A r7 = r8.A09
            java.lang.String r2 = "@"
            int r6 = r4.length()
            int r1 = r6 + (-1)
            int r5 = X.AbstractC001900j.A07(r4, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2 = -1
            r1 = 0
            if (r5 == r2) goto L40
            r1 = 1
        L40:
            boolean r1 = X.AbstractC31174DnI.A1b(r1)
            if (r1 != 0) goto L47
            r3 = r0
        L47:
            r7.Egh(r3)
            X.7hR r3 = r8.A01
            if (r3 == 0) goto L73
            java.lang.Object r1 = r7.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L70
            int r1 = r1.intValue()
            int r1 = r1 + 1
            java.lang.CharSequence r2 = r4.subSequence(r1, r6)
            r1 = 32
            boolean r1 = X.AbstractC001900j.A0U(r2, r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L70
            if (r2 == 0) goto L70
            java.lang.String r0 = r2.toString()
        L70:
            r3.Eby(r0)
        L73:
            X.Jn6 r0 = A02(r10)
            X.0UO r0 = r0.A0c
            java.lang.Object r0 = r0.getValue()
            r2 = 0
            r5 = 1
            if (r0 != 0) goto Le0
            X.Jn6 r0 = A02(r10)
            X.05A r0 = r0.A0E
            java.lang.Object r1 = r0.getValue()
            X.KcM r0 = X.EnumC46184KcM.A0A
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            if (r0 != 0) goto Le0
            X.6tz r3 = X.C152716tz.A00
            r1 = 29
            X.MDx r0 = new X.MDx
            r0.<init>(r1, r9, r10)
            r3.A04(r9, r0, r2, r5)
            if (r4 == 0) goto Lc3
            int r0 = r4.length()
            if (r0 == 0) goto Lc3
            java.lang.String r0 = ""
            r9.setHint(r0)
        Lac:
            int r0 = r4.length()
            if (r0 != 0) goto Lb3
        Lb2:
            r2 = 1
        Lb3:
            r1 = r2 ^ 1
            com.instagram.common.ui.base.IgEditText r0 = r10.A0I
            if (r0 != 0) goto Le9
            java.lang.String r0 = "noteEditText"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lc3:
            java.lang.String r0 = A04(r10)
            r9.setHint(r0)
            X.Jn6 r0 = A02(r10)
            X.05A r0 = r0.A0E
            java.lang.Object r1 = r0.getValue()
            X.KcM r0 = X.EnumC46184KcM.A07
            if (r1 != r0) goto Le0
            r1 = 1093664768(0x41300000, float:11.0)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r9.setTextSize(r1)
        Le0:
            if (r4 == 0) goto Lb2
            goto Lac
        Le3:
            r1 = r0
            goto L1d
        Le6:
            r1 = r0
            goto L11
        Le9:
            r0.setGravity(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.A05(android.text.Editable, com.instagram.common.ui.base.IgEditText, X.KBb):void");
    }

    public static final void A06(View view, int i) {
        View A0E = AbstractC43594JPz.A0E(view);
        A0E.post(new M5X(view, i, A0E));
    }

    public static final void A08(View view, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(view);
        if (interfaceC16660sJ != null) {
            Resources resources = view.getResources();
            C14360o3.A07(resources);
            i = AbstractC166987dD.A0H(interfaceC16660sJ.invoke(resources));
        } else if (num != null) {
            i = JQ0.A07(view, num.intValue());
        } else {
            i = 0;
        }
        A0G.setMargins(0, i, 0, 0);
        view.setLayoutParams(A0G);
    }

    public static final void A0A(C45466KBb c45466KBb) {
        View.OnClickListener onClickListener;
        boolean A0X = c45466KBb.A0X();
        NotesCreationPogView notesCreationPogView = c45466KBb.A0d;
        if (A0X) {
            if (notesCreationPogView != null) {
                onClickListener = c45466KBb.A1Y;
                C0fQ.A00(onClickListener, notesCreationPogView);
                return;
            }
            C14360o3.A0F("pogViewContainer");
            throw C00O.createAndThrow();
        }
        if (notesCreationPogView != null) {
            onClickListener = c45466KBb.A1X;
            C0fQ.A00(onClickListener, notesCreationPogView);
            return;
        }
        C14360o3.A0F("pogViewContainer");
        throw C00O.createAndThrow();
    }

    public static final void A0D(C45466KBb c45466KBb) {
        Context context = c45466KBb.getContext();
        if (context != null) {
            InterfaceC09390do interfaceC09390do = c45466KBb.A1V;
            boolean A0D = C4AC.A0D(AbstractC166987dD.A0r(interfaceC09390do));
            Resources resources = context.getResources();
            int i = 2131957651;
            if (A0D) {
                i = 2131957650;
            }
            String string = resources.getString(i);
            C14360o3.A0A(string);
            C50674MYs c50674MYs = new C50674MYs(context, AbstractC166987dD.A0r(interfaceC09390do));
            c50674MYs.A09(string, ViewOnClickListenerC48072LPx.A00(c45466KBb, 62));
            c50674MYs.A0B(AbstractC166997dE.A0q(context.getResources(), 2131954828), ViewOnClickListenerC48072LPx.A00(c45466KBb, 63));
            new C31727DwY(c50674MYs).A07(context);
        }
    }

    public static final void A0H(C45466KBb c45466KBb) {
        View view;
        String str;
        if (c45466KBb.A0X()) {
            view = c45466KBb.A0B;
            if (view == null) {
                str = "videoNoteCardEntrypointButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            view.setVisibility(8);
        }
        view = c45466KBb.A0i;
        if (view == null) {
            str = "videoPogInNoteCreationEntrypoint";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        view.setVisibility(8);
    }

    public static final void A0I(C45466KBb c45466KBb) {
        C67s c67s;
        Jn6 A02 = A02(c45466KBb);
        Iterable iterable = (Iterable) A02.A0O.A0p.getValue();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : iterable) {
            C6C9 c6c9 = (C6C9) obj;
            if (AbstractC31171DnF.A1W(A02.A0M, c6c9.A0D.getId()) && (((c67s = c6c9.A0A) != null && c67s.A08 != null) || c6c9.A0H.equals("2"))) {
                A1E.add(obj);
            }
        }
        if (A1E.size() >= 1) {
            C193328hC A0O = AbstractC31175DnJ.A0O(c45466KBb);
            A0O.A0A(2131968703);
            A0O.A0r(AbstractC166997dE.A0N(c45466KBb).getString(2131968704));
            AbstractC31176DnK.A15(LMX.A00, A0O);
        } else {
            A02(c45466KBb).A0E.Egh(EnumC46184KcM.A07);
        }
        AbstractC135966Db.A01(AbstractC166987dD.A0r(c45466KBb.A1V)).A09(EnumC46284KeG.NOTE_CHAT);
    }

    public static final void A0J(C45466KBb c45466KBb) {
        View view;
        TextView A0e;
        View inflate;
        if (A02(c45466KBb).A0h.getValue() == EnumC46184KcM.A05 && !c45466KBb.A0w) {
            InterfaceC09390do interfaceC09390do = c45466KBb.A1V;
            if (C4AC.A07(AbstractC166987dD.A0r(interfaceC09390do))) {
                View view2 = c45466KBb.A06;
                if (view2 == null) {
                    View view3 = c45466KBb.A04;
                    View view4 = null;
                    if (view3 == null) {
                        C14360o3.A0F("bottomBarContainer");
                        throw C00O.createAndThrow();
                    }
                    ViewStub A07 = AbstractC31171DnF.A07(view3, R.id.music_note_reshare_setting_toggle);
                    if (A07 != null && (inflate = A07.inflate()) != null) {
                        IgdsSwitch igdsSwitch = (IgdsSwitch) inflate.requireViewById(R.id.reshare_setting_toggle);
                        igdsSwitch.A07 = new C49501LuE(c45466KBb, 2);
                        if (AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01.getBoolean("notes_music_reshare_enabled_pref", true)) {
                            igdsSwitch.toggle();
                        }
                        view4 = inflate;
                    }
                    c45466KBb.A06 = view4;
                    if (AbstractC166997dE.A0Y(AbstractC166987dD.A0r(interfaceC09390do)).A0M() == C05F.A0C && (view = c45466KBb.A06) != null && (A0e = AbstractC166987dD.A0e(view, R.id.reshare_setting_toggle_text)) != null) {
                        AbstractC31173DnH.A19(AbstractC166997dE.A0N(c45466KBb), A0e, 2131968766);
                    }
                } else {
                    view2.setVisibility(0);
                }
                View view5 = c45466KBb.A06;
                if (view5 != null) {
                    ((L7W) c45466KBb.A1S.getValue()).A00(view5, EnumC58132lV.A02, C05F.A0Y, AbstractC166997dE.A0q(AbstractC166997dE.A0N(c45466KBb), 2131968765));
                }
            }
        }
    }

    public static final void A0K(C45466KBb c45466KBb) {
        if (A02(c45466KBb).A0c.getValue() == null) {
            A0R(c45466KBb, "notes_music_button");
        }
        AbstractC135966Db.A01(AbstractC166987dD.A0r(c45466KBb.A1V)).A09(EnumC46284KeG.MUSIC);
    }

    public static final void A0N(C45466KBb c45466KBb) {
        View view;
        String str;
        if (c45466KBb.A0X()) {
            view = c45466KBb.A0B;
            if (view == null) {
                str = "videoNoteCardEntrypointButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            view.setVisibility(0);
        }
        view = c45466KBb.A0i;
        if (view == null) {
            str = "videoPogInNoteCreationEntrypoint";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        view.setVisibility(0);
    }

    public static final void A0U(C45466KBb c45466KBb, List list) {
        String str;
        if (c45466KBb.A0a()) {
            IgLinearLayout igLinearLayout = c45466KBb.A0K;
            str = "noteTypeEntryPointsLayout";
            if (igLinearLayout != null) {
                if (igLinearLayout.getScaleX() != 1.0f) {
                    IgLinearLayout igLinearLayout2 = c45466KBb.A0K;
                    if (igLinearLayout2 != null) {
                        JQ0.A0G(igLinearLayout2.animate(), 1.0f).withStartAction(new RunnableC49877M0w(c45466KBb)).start();
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            str = "noteTypeEntryPointsLayout";
            if (c45466KBb.A0w) {
                IgLinearLayout igLinearLayout3 = c45466KBb.A0K;
                if (igLinearLayout3 != null) {
                    igLinearLayout3.setVisibility(8);
                    return;
                }
            } else {
                IgLinearLayout igLinearLayout4 = c45466KBb.A0K;
                if (igLinearLayout4 != null) {
                    igLinearLayout4.setVisibility(0);
                    Iterator it = c45466KBb.A1F.iterator();
                    while (it.hasNext()) {
                        View A09 = AbstractC43592JPx.A09(it);
                        if (list.contains(A09)) {
                            A09.setVisibility(0);
                        } else {
                            A09.setVisibility(8);
                        }
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0V(C45466KBb c45466KBb, boolean z) {
        int A04 = AbstractC167017dG.A04(c45466KBb.requireContext());
        int A0D = AbstractC167017dG.A0D(c45466KBb.requireContext());
        IgEditText igEditText = c45466KBb.A0J;
        if (igEditText == null) {
            C14360o3.A0F("promptEditText");
            throw C00O.createAndThrow();
        }
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(igEditText);
        int i = 1;
        if (z) {
            i = -1;
        }
        int i2 = A04 + (A0D * i);
        int i3 = A0G.topMargin;
        if (i2 != i3) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i3, i2);
            C44249Jgt.A00(ofInt, A0G, c45466KBb, 6);
            AbstractC43592JPx.A1A(ofInt);
            ofInt.setDuration(250L);
            ofInt.start();
        }
    }

    private final boolean A0X() {
        if (A0h(this) && !A0i(this)) {
            UserSession A0r = AbstractC166987dD.A0r(this.A1V);
            if (C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36320468248568344L)) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0Y() {
        if (!A0d(this) && !A0i(this) && !AbstractC167007dF.A1Z(this.A1N) && !this.A0x) {
            UserSession A0r = AbstractC166987dD.A0r(this.A1V);
            if (C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36329071067545599L)) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0Z() {
        if (!AbstractC167007dF.A1X(A02(this).A0E.getValue(), EnumC46184KcM.A0A)) {
            C08730cb c08730cb = C17060sy.A01;
            InterfaceC09390do interfaceC09390do = this.A1V;
            Boolean Cda = AbstractC31171DnF.A0T(AbstractC166987dD.A0r(interfaceC09390do), c08730cb).Cda();
            if ((Cda == null || !Cda.booleanValue()) && !AbstractC31172DnG.A1a(AbstractC166987dD.A0x(AbstractC166987dD.A0r(interfaceC09390do)), "has_seen_spotify_note_creation_nux") && A0Y()) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0a() {
        if (!A0d(this) && !A0i(this)) {
            UserSession A0r = AbstractC166987dD.A0r(this.A1V);
            if (C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36320025866411946L)) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0b() {
        long j;
        boolean A0d = A0d(this);
        UserSession A0r = AbstractC166987dD.A0r(this.A1V);
        C06090Tz A0U = AbstractC166997dE.A0U(A0r);
        if (A0d) {
            j = 36323702358486524L;
        } else {
            j = 36316053022379948L;
        }
        return C18U.A06(A0U, A0r, j);
    }

    public static final boolean A0c(UserSession userSession) {
        if (!C4AC.A0B(userSession) && !C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325755352790339L)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r7.A0x != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0h(X.C45466KBb r7) {
        /*
            boolean r0 = A0d(r7)
            r6 = 1
            r5 = r0 ^ 1
            X.0do r0 = r7.A1V
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r0)
            r4 = 0
            X.0Tz r3 = X.AbstractC25225BEi.A0j(r2, r4)
            r0 = 36321267112486162(0x810a0000082512, double:3.033053803715192E-306)
            boolean r2 = X.C18U.A06(r3, r2, r0)
            X.0do r0 = r7.A1N
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 != 0) goto L28
            boolean r0 = r7.A0x
            r1 = 0
            if (r0 == 0) goto L29
        L28:
            r1 = 1
        L29:
            if (r5 == 0) goto L44
            boolean r0 = r7.A0z
            if (r0 == 0) goto L3f
            com.instagram.common.session.UserSession r2 = X.AbstractC43592JPx.A0T(r7, r4)
            r0 = 36322151875487771(0x810ace0004281b, double:3.0336133314000644E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 == 0) goto L44
        L3e:
            return r6
        L3f:
            if (r1 == 0) goto L3e
            if (r2 == 0) goto L44
            return r6
        L44:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.A0h(X.KBb):boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        Serializable serializable;
        EnumC25577BSp enumC25577BSp;
        String str4;
        String str5;
        Integer num;
        String str6;
        Integer num2;
        ImageUrl imageUrl;
        boolean z2;
        boolean z3;
        boolean z4;
        AudioOverlayTrack audioOverlayTrack;
        Boolean bool;
        Bundle bundle2;
        Window window;
        int A02 = C0f9.A02(-1997166474);
        super.onCreate(bundle);
        Fade fade = new Fade();
        fade.setDuration(200L);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        FragmentActivity activity = getActivity();
        String str7 = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setExitTransition(fade);
            window.setEnterTransition(fade);
            Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                sharedElementEnterTransition.setDuration(200L);
            }
            window.setSharedElementReturnTransition(null);
            Transition sharedElementEnterTransition2 = window.getSharedElementEnterTransition();
            if (sharedElementEnterTransition2 != null) {
                sharedElementEnterTransition2.addListener(new C55350OiC(this, 0));
            }
        }
        Bundle bundle3 = this.mArguments;
        boolean z5 = false;
        if (bundle3 != null) {
            z = bundle3.getBoolean("replace_note");
        } else {
            z = false;
        }
        this.A10 = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str = bundle4.getString("content_id");
        } else {
            str = null;
        }
        this.A0n = str;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str2 = bundle5.getString("content_media_code");
        } else {
            str2 = null;
        }
        this.A0p = str2;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            str3 = bundle6.getString("content_container_module");
        } else {
            str3 = null;
        }
        this.A0m = str3;
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            serializable = bundle7.getSerializable("content_event_source");
        } else {
            serializable = null;
        }
        if (serializable instanceof EnumC25577BSp) {
            enumC25577BSp = (EnumC25577BSp) serializable;
        } else {
            enumC25577BSp = null;
        }
        this.A0D = enumC25577BSp;
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            str4 = bundle8.getString("content_inventory_source");
        } else {
            str4 = null;
        }
        this.A0o = str4;
        Bundle bundle9 = this.mArguments;
        if (bundle9 != null) {
            str5 = bundle9.getString("content_ranking_info_token");
        } else {
            str5 = null;
        }
        this.A0q = str5;
        Bundle bundle10 = this.mArguments;
        if (bundle10 != null) {
            num = AbstractC31179DnN.A0X(bundle10, "content_media_position");
        } else {
            num = null;
        }
        this.A0k = num;
        Bundle bundle11 = this.mArguments;
        if (bundle11 != null) {
            str6 = bundle11.getString("content_carousel_child_id");
        } else {
            str6 = null;
        }
        this.A0l = str6;
        Bundle bundle12 = this.mArguments;
        if (bundle12 != null && bundle12.containsKey("content_carousel_child_index") && (bundle2 = this.mArguments) != null) {
            num2 = AbstractC31179DnN.A0X(bundle2, "content_carousel_child_index");
        } else {
            num2 = null;
        }
        this.A0j = num2;
        Bundle bundle13 = this.mArguments;
        if (bundle13 != null) {
            imageUrl = (ImageUrl) AbstractC53062bn.A01(bundle13, ImageUrl.class, "content_preview_url");
        } else {
            imageUrl = null;
        }
        this.A0H = imageUrl;
        Bundle bundle14 = this.mArguments;
        if (bundle14 != null) {
            z2 = bundle14.getBoolean("profile_creation_point");
        } else {
            z2 = false;
        }
        this.A0z = z2;
        ((C3I9) AbstractC166987dD.A17(this.A1O)).A9e((InterfaceC60152ox) this.A1P.getValue());
        Bundle bundle15 = this.mArguments;
        if (bundle15 != null) {
            z3 = bundle15.getBoolean("arg_feed_creation_point");
        } else {
            z3 = false;
        }
        this.A17 = z3;
        Bundle bundle16 = this.mArguments;
        if (bundle16 != null) {
            z4 = bundle16.getBoolean("arg_is_animated_bubble_tapped");
        } else {
            z4 = false;
        }
        this.A0u = z4;
        Bundle bundle17 = this.mArguments;
        if (bundle17 != null) {
            audioOverlayTrack = (AudioOverlayTrack) bundle17.getParcelable("arg_music_to_preload");
        } else {
            audioOverlayTrack = null;
        }
        this.A0h = audioOverlayTrack;
        Bundle bundle18 = this.mArguments;
        if (bundle18 != null) {
            bool = AbstractC31174DnI.A0n(bundle18, "arg_fetch_for_listening_now");
        } else {
            bool = null;
        }
        if (AbstractC166997dE.A1Z(bool, true)) {
            A02(this).A04();
        }
        Jn6 A022 = A02(this);
        Bundle bundle19 = this.mArguments;
        if (bundle19 != null) {
            str7 = bundle19.getString("arg_music_note_original_author_id");
        }
        A022.A04 = str7;
        A02(this).A06(this.A0h, null);
        Bundle bundle20 = this.mArguments;
        if (bundle20 != null) {
            z5 = bundle20.getBoolean("arg_is_in_immersive_mode");
        }
        this.A0w = z5;
        if (z5) {
            C25854Bc9 c25854Bc9 = (C25854Bc9) this.A1H.getValue();
            String str8 = this.A0n;
            if (str8 == null) {
                str8 = "";
            }
            c25854Bc9.A00(str8);
        }
        C85363rR c85363rR = C85363rR.A00;
        InterfaceC09390do interfaceC09390do = this.A1V;
        this.A0v = c85363rR.A09(AbstractC166987dD.A0r(interfaceC09390do));
        this.A1A = c85363rR.A09(AbstractC166987dD.A0r(interfaceC09390do));
        this.A19 = C85363rR.A07(AbstractC166987dD.A0r(interfaceC09390do));
        this.A18 = C85363rR.A04(AbstractC166987dD.A0r(interfaceC09390do));
        if (A0Y()) {
            NotesRepository notesRepository = A02(this).A0O;
            GSR.A02(notesRepository, ((C4A7) notesRepository).A01, 37);
        }
        C0f9.A09(1069893702, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1501781786);
        super.onDestroy();
        ((C3I9) AbstractC166987dD.A17(this.A1O)).onDestroy();
        if (this.A0w && !C28425CgX.A00.A03(AbstractC166987dD.A0r(this.A1V))) {
            C25854Bc9 c25854Bc9 = (C25854Bc9) this.A1H.getValue();
            String str = this.A0n;
            if (str == null) {
                str = "";
            }
            c25854Bc9.A01(str, null);
        }
        if (AbstractC167007dF.A1X(A02(this).A0E.getValue(), EnumC46184KcM.A0A)) {
            Jn6 A022 = A02(this);
            NotesRepository notesRepository = A022.A0O;
            GSR.A02(notesRepository, ((C4A7) notesRepository).A01, 40);
            A022.A0E.Egh(EnumC46184KcM.A06);
            Jn6.A00(A022);
        }
        C0f9.A09(-1887826724, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1854463929);
        super.onDestroyView();
        InterfaceC41501vz interfaceC41501vz = this.A0F;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A1V)).A02(interfaceC41501vz, C55985OtI.class);
        }
        RecyclerView recyclerView = this.A0C;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.A0C = null;
        A0S(this, "onDestroyView");
        C0f9.A09(-1213975917, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1619136139);
        super.onPause();
        NotesCreationPogView notesCreationPogView = this.A0d;
        if (notesCreationPogView == null) {
            C14360o3.A0F("pogViewContainer");
            throw C00O.createAndThrow();
        }
        InterfaceC56392iX interfaceC56392iX = notesCreationPogView.A06;
        if (interfaceC56392iX.CWW()) {
            ((VideoView) interfaceC56392iX.getView()).pause();
        }
        JYR jyr = this.A0f;
        if (jyr != null) {
            JYR.A00(jyr, "notes_creation_sheet", " onPause");
        }
        this.A1B.removeCallbacks(this.A1E);
        C0f9.A09(-284424162, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(400909171);
        super.onResume();
        NotesCreationPogView notesCreationPogView = this.A0d;
        String str = "pogViewContainer";
        if (notesCreationPogView != null) {
            notesCreationPogView.A07.setTransitionName(null);
            NotesCreationBubbleView notesCreationBubbleView = this.A0c;
            if (notesCreationBubbleView == null) {
                str = "bubbleView";
            } else {
                notesCreationBubbleView.setTransitionName(null);
                NotesCreationPogView notesCreationPogView2 = this.A0d;
                if (notesCreationPogView2 != null) {
                    InterfaceC56392iX interfaceC56392iX = notesCreationPogView2.A06;
                    if (interfaceC56392iX.CWW()) {
                        ((VideoView) interfaceC56392iX.getView()).seekTo(0);
                        NotesCreationPogView notesCreationPogView3 = this.A0d;
                        if (notesCreationPogView3 != null) {
                            ((VideoView) notesCreationPogView3.A06.getView()).start();
                        }
                    }
                    JYR jyr = this.A0f;
                    if (jyr != null) {
                        String A0R = AnonymousClass001.A0R("notes_creation_sheet", " onResume");
                        C14360o3.A0B(A0R, 0);
                        C5TA c5ta = jyr.A00;
                        if (c5ta != null) {
                            c5ta.A0B(A0R, false);
                        }
                    }
                    if (!A0Z()) {
                        IgEditText igEditText = this.A0I;
                        if (igEditText == null) {
                            str = "noteEditText";
                        } else {
                            F3X.A00(igEditText);
                        }
                    }
                    if (AbstractC167007dF.A1X(A02(this).A0E.getValue(), EnumC46184KcM.A0A)) {
                        A02(this).A04();
                    }
                    C45127Jxw c45127Jxw = (C45127Jxw) A02(this).A0c.getValue();
                    if (c45127Jxw != null && c45127Jxw.A01 != null) {
                        this.A1B.post(this.A1E);
                    }
                    C0f9.A09(266475786, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (X.C4AC.A06(r1) == false) goto L14;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r8 = this;
            r0 = 823353085(0x31135efd, float:2.144531E-9)
            int r6 = X.C0f9.A02(r0)
            super.onStart()
            X.0do r0 = r8.A1O
            java.lang.Object r1 = X.AbstractC166987dD.A17(r0)
            X.3I9 r1 = (X.C3I9) r1
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            r1.Dnr(r0)
            android.os.Bundle r1 = r8.mArguments
            r7 = 0
            if (r1 == 0) goto L91
            java.lang.String r0 = "arg_launch_music_flow"
            boolean r2 = r1.getBoolean(r0)
        L24:
            android.os.Bundle r1 = r8.mArguments
            if (r1 == 0) goto L2e
            java.lang.String r0 = "arg_launch_video_flow"
            boolean r7 = r1.getBoolean(r0)
        L2e:
            X.0do r0 = r8.A1V
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            boolean r0 = A0d(r8)
            if (r0 != 0) goto L47
            boolean r0 = A0i(r8)
            if (r0 != 0) goto L47
            boolean r1 = X.C4AC.A06(r1)
            r0 = 1
            if (r1 != 0) goto L48
        L47:
            r0 = 0
        L48:
            java.lang.String r5 = "noteEditText"
            r3 = 250(0xfa, double:1.235E-321)
            if (r0 == 0) goto L7f
            if (r2 == 0) goto L7f
            com.instagram.common.ui.base.IgEditText r1 = r8.A0I
            if (r1 == 0) goto L93
            X.M0z r0 = new X.M0z
            r0.<init>(r8)
        L59:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.postDelayed(r0, r3)
        L5e:
            android.os.Bundle r1 = r8.mArguments
            if (r1 == 0) goto L78
            java.lang.String r0 = "arg_music_to_display"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.music.common.model.AudioOverlayTrack r2 = (com.instagram.music.common.model.AudioOverlayTrack) r2
            if (r2 == 0) goto L78
            com.instagram.common.ui.base.IgEditText r1 = r8.A0I
            if (r1 == 0) goto L93
            X.M3v r0 = new X.M3v
            r0.<init>(r8, r2)
            r1.postDelayed(r0, r3)
        L78:
            r0 = -573201878(0xffffffffddd5a22a, float:-1.9242391E18)
            X.C0f9.A09(r0, r6)
            return
        L7f:
            boolean r0 = A0h(r8)
            if (r0 == 0) goto L5e
            if (r7 == 0) goto L5e
            com.instagram.common.ui.base.IgEditText r1 = r8.A0I
            if (r1 == 0) goto L93
            X.M10 r0 = new X.M10
            r0.<init>(r8)
            goto L59
        L91:
            r2 = 0
            goto L24
        L93:
            X.C14360o3.A0F(r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.onStart():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(2128669522);
        super.onStop();
        ((C3I9) AbstractC166987dD.A17(this.A1O)).onStop();
        C0f9.A09(-1034503988, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0392, code lost:
    
        if (X.C4AC.A06(r1) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x040b, code lost:
    
        if (X.C14360o3.A0K(X.AbstractC92944En.A03(r1, X.AbstractC43592JPx.A0T(r36, 1)), r1.getResources().getString(2131968743)) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x020b, code lost:
    
        if (X.C14360o3.A0K(X.AbstractC92944En.A03(r1, X.AbstractC43592JPx.A0T(r36, 1)), r1.getResources().getString(2131968712)) != false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0aad  */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r37, android.view.ViewGroup r38, android.os.Bundle r39) {
        /*
            Method dump skipped, instructions count: 3196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45466KBb.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
