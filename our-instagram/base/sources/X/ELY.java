package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ELY extends AbstractC59962oe implements InterfaceC60072op, InterfaceC11480j6, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditCollectionFragment";
    public EditText A00;
    public IgdsListCell A01;
    public SavedCollection A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public View.OnClickListener A08;
    public View A09;
    public View A0A;
    public C56352iT A0B;
    public ImageUrl A0C;
    public IgTextView A0D;
    public RoundedCornerCheckMarkSelectableImageView A0E;
    public boolean A0F;
    public final Handler A0G = new Handler();
    public final InterfaceC09390do A0H = AbstractC60492pY.A02(this);
    public final TextWatcher A0I = new C35469Fl4(this, 31);

    public static final void A01(ELY ely) {
        String str;
        ely.A06 = true;
        C56352iT c56352iT = ely.A0B;
        if (c56352iT != null) {
            c56352iT.setIsLoading(true);
            c56352iT.EkS(false);
        }
        EditText editText = ely.A00;
        if (editText == null) {
            str = "collectionName";
        } else {
            editText.setEnabled(false);
            IgTextView igTextView = ely.A0D;
            if (igTextView == null) {
                str = "deleteButton";
            } else {
                igTextView.setOnClickListener(null);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131972741);
        ?? obj = new Object();
        C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131972741);
        this.A0A = C31722DwR.A00(new ViewOnClickListenerC35686FpL(this, 14), interfaceC56362iU, obj);
        interfaceC56362iU.setIsLoading(this.A06);
        A00(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "collection_editor";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        SavedCollection savedCollection = this.A02;
        if (savedCollection == null) {
            C14360o3.A0F("collection");
            throw C00O.createAndThrow();
        }
        bundle.putParcelable("collection_to_edit", savedCollection);
        bundle.putBoolean(AbstractC111324zv.A00(362), this.A0F);
        bundle.putParcelable("cover_media_url", this.A0C);
        bundle.putString("cover_media_id", this.A03);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EditText A0H = AbstractC31173DnH.A0H(view, R.id.saved_collection_name);
        SavedCollection savedCollection = this.A02;
        String str = "collection";
        if (savedCollection != null) {
            A0H.setText(savedCollection.A0G);
            A0H.addTextChangedListener(this.A0I);
            this.A00 = A0H;
            this.A08 = new ViewOnClickListenerC35686FpL(this, 17);
            IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.delete_collection_button);
            View.OnClickListener onClickListener = this.A08;
            if (onClickListener == null) {
                str = "deleteButtonOnClickListener";
            } else {
                C0fQ.A00(onClickListener, A0X);
                A0X.setText(2131972738);
                this.A0D = A0X;
                AbstractC166997dE.A0T(view, R.id.delete_collection_confirmation).setText(2131972739);
                View A0S = AbstractC166997dE.A0S(view, R.id.audience_selector);
                InterfaceC09390do interfaceC09390do = this.A0H;
                boolean A01 = AbstractC35085Fcw.A01(AbstractC166987dD.A0r(interfaceC09390do));
                this.A07 = A01;
                if (A01) {
                    View A0S2 = AbstractC166997dE.A0S(view, R.id.saved_collection_name_title);
                    A0S2.setPadding(A0S2.getPaddingLeft(), A0S2.getPaddingTop(), A0S2.getPaddingRight(), 0);
                    SavedCollection savedCollection2 = this.A02;
                    if (savedCollection2 != null) {
                        this.A04 = savedCollection2.A06();
                        A0S.setVisibility(0);
                        IgdsListCell A0Y = AbstractC31173DnH.A0Y(view, R.id.change_audience);
                        this.A01 = A0Y;
                        if (A0Y != null) {
                            A0Y.A0G(EnumC53237Nga.A04, true);
                        }
                        IgdsListCell igdsListCell = this.A01;
                        if (igdsListCell != null) {
                            igdsListCell.A0I(AbstractC166997dE.A0p(requireContext(), 2131972797));
                        }
                        A03(this);
                        SavedCollection savedCollection3 = this.A02;
                        if (savedCollection3 != null) {
                            boolean A1W = AbstractC167007dF.A1W(savedCollection3.A05);
                            IgdsListCell igdsListCell2 = this.A01;
                            if (A1W) {
                                if (igdsListCell2 != null) {
                                    igdsListCell2.setAlpha(0.5f);
                                }
                                igdsListCell2 = this.A01;
                                if (igdsListCell2 != null) {
                                    i = 15;
                                    igdsListCell2.A0C(new ViewOnClickListenerC35686FpL(this, i));
                                }
                            } else if (igdsListCell2 != null) {
                                i = 16;
                                igdsListCell2.A0C(new ViewOnClickListenerC35686FpL(this, i));
                            }
                        }
                    }
                }
                if (this.A0F) {
                    View A0U = AbstractC167017dG.A0U(view, R.id.change_cover_photo_stub);
                    ViewOnClickListenerC35686FpL.A00(A0U, 18, this);
                    this.A09 = A0U;
                    if (A0U != null) {
                        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = (RoundedCornerCheckMarkSelectableImageView) A0U.requireViewById(R.id.collection_image);
                        ImageUrl imageUrl = this.A0C;
                        if (imageUrl != null) {
                            roundedCornerCheckMarkSelectableImageView.setUrl(imageUrl, this);
                        }
                        this.A0E = roundedCornerCheckMarkSelectableImageView;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                SavedCollection savedCollection4 = this.A02;
                if (savedCollection4 != null) {
                    User user = savedCollection4.A08;
                    if (user != null) {
                        C14360o3.A0K(user.getId(), AbstractC31173DnH.A0t(interfaceC09390do));
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(ELY ely) {
        View view = ely.A0A;
        if (view != null) {
            EditText editText = ely.A00;
            if (editText == null) {
                C14360o3.A0F("collectionName");
                throw C00O.createAndThrow();
            }
            Editable text = editText.getText();
            C14360o3.A07(text);
            view.setEnabled(AbstractC25225BEi.A1Y(text));
        }
    }

    public static final void A03(ELY ely) {
        Context requireContext;
        int i;
        IgdsListCell igdsListCell;
        if (AbstractC31176DnK.A0g(C17060sy.A01, ely.A0H).A0M() == C05F.A01 && ely.A04) {
            IgdsListCell igdsListCell2 = ely.A01;
            if (igdsListCell2 != null) {
                AbstractC31180DnO.A12(ely.requireContext(), igdsListCell2, 2131972826);
            }
            requireContext = ely.requireContext();
            i = R.drawable.instagram_globe_pano_outline_24;
        } else {
            boolean z = ely.A04;
            IgdsListCell igdsListCell3 = ely.A01;
            if (z) {
                if (igdsListCell3 != null) {
                    AbstractC31180DnO.A12(ely.requireContext(), igdsListCell3, 2131972815);
                }
                requireContext = ely.requireContext();
                i = R.drawable.instagram_users_pano_outline_24;
            } else {
                if (igdsListCell3 != null) {
                    AbstractC31180DnO.A12(ely.requireContext(), igdsListCell3, 2131972821);
                }
                requireContext = ely.requireContext();
                i = R.drawable.instagram_lock_pano_outline_24;
            }
        }
        Drawable drawable = requireContext.getDrawable(i);
        if (drawable != null && (igdsListCell = ely.A01) != null) {
            igdsListCell.A09(drawable);
        }
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC31173DnH.A0t(this.A0H));
        return c11520jB;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0H);
    }

    public static final void A02(ELY ely) {
        String str;
        Context context = ely.getContext();
        if (context != null) {
            AbstractC35254Fgn.A06(context, ely.getString(2131976159), ely.getString(2131961880));
        }
        C56352iT c56352iT = ely.A0B;
        if (c56352iT != null) {
            c56352iT.setIsLoading(false);
            c56352iT.EkS(true);
        }
        EditText editText = ely.A00;
        if (editText == null) {
            str = "collectionName";
        } else {
            editText.setEnabled(true);
            IgTextView igTextView = ely.A0D;
            if (igTextView == null) {
                str = "deleteButton";
            } else {
                View.OnClickListener onClickListener = ely.A08;
                if (onClickListener == null) {
                    str = "deleteButtonOnClickListener";
                } else {
                    C0fQ.A00(onClickListener, igTextView);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1042) {
            if (intent != null) {
                str = intent.getStringExtra("cover_media_id");
            } else {
                str = null;
            }
            this.A03 = str;
            if (intent != null) {
                ImageUrl imageUrl = (ImageUrl) intent.getParcelableExtra("cover_media_url");
                if (imageUrl != null) {
                    this.A0C = imageUrl;
                    RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = this.A0E;
                    if (roundedCornerCheckMarkSelectableImageView != null) {
                        roundedCornerCheckMarkSelectableImageView.setUrl(imageUrl, this);
                    }
                }
                if (intent.getBooleanExtra(AbstractC111324zv.A00(2200), false) && this.A04 && AbstractC35085Fcw.A01(AbstractC166987dD.A0r(this.A0H))) {
                    C146106i8 A0j = AbstractC25229BEm.A0j();
                    AbstractC31171DnF.A18(this, A0j, 2131971137);
                    A0j.A0I = getString(2131971136);
                    AbstractC31178DnM.A1S(A0j);
                }
            }
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        ExtendedImageUrl extendedImageUrl;
        int A02 = C0f9.A02(558307275);
        super.onCreate(bundle);
        boolean z = true;
        if (bundle == null || !bundle.containsKey("collection_to_edit")) {
            z = false;
        }
        String A00 = AbstractC111324zv.A00(362);
        if (z) {
            Parcelable parcelable = bundle.getParcelable("collection_to_edit");
            if (parcelable != null) {
                this.A02 = (SavedCollection) parcelable;
                this.A0F = bundle.getBoolean(A00);
                this.A0C = (ImageUrl) bundle.getParcelable("cover_media_url");
                this.A03 = bundle.getString("cover_media_id");
                C0f9.A09(-1801287594, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 423912342;
            C0f9.A09(i, A02);
            throw A14;
        }
        Parcelable parcelable2 = requireArguments().getParcelable("collection_to_edit");
        if (parcelable2 != null) {
            this.A02 = (SavedCollection) parcelable2;
            this.A0F = requireArguments().getBoolean(A00);
            SavedCollection savedCollection = this.A02;
            if (savedCollection == null) {
                C14360o3.A0F("collection");
                throw C00O.createAndThrow();
            }
            Context requireContext = requireContext();
            C38321qM c38321qM = savedCollection.A04;
            if (c38321qM != null) {
                extendedImageUrl = c38321qM.A1q(requireContext);
            } else {
                extendedImageUrl = null;
            }
            this.A0C = extendedImageUrl;
            C0f9.A09(-1801287594, A02);
            return;
        }
        A14 = AbstractC166987dD.A14("Required value was null.");
        i = 400495648;
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1215711900);
        C14360o3.A0B(layoutInflater, 0);
        this.A0B = AbstractC31177DnL.A0L(this);
        View inflate = layoutInflater.inflate(R.layout.edit_collection, viewGroup, false);
        C0f9.A09(1487452715, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(985225486);
        super.onPause();
        AbstractC31171DnF.A16(this);
        C0f9.A09(642066362, A02);
    }
}
