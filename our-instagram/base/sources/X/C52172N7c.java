package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;

/* renamed from: X.N7c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52172N7c extends C53Z {
    public static final String __redex_internal_original_name = "LiveTitleEntryBottomSheetFragment";
    public EditText A00;
    public TextView A01;
    public AnonymousClass857 A02;
    public InterfaceC57937Pmh A03;
    public boolean A05;
    public IgButton A06;
    public ArrayList A04 = AbstractC166987dD.A1E();
    public final InterfaceC41501vz A07 = C56035Ou7.A00(this, 21);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.avatar);
        C08730cb c08730cb = C17060sy.A01;
        AbstractC31173DnH.A1T(this, A0T, c08730cb.A01(getSession()));
        A0T.setContentDescription(AbstractC31173DnH.A0n(getSession(), c08730cb));
        this.A00 = (EditText) view.requireViewById(R.id.input);
        IgButton igButton = (IgButton) view.requireViewById(R.id.button_submit);
        this.A06 = igButton;
        String str = "submitButton";
        if (this.A05) {
            if (igButton != null) {
                igButton.setText(2131964008);
                View inflate = AbstractC167007dF.A0M(view, R.id.branded_content_live_entrypoint).inflate();
                ViewOnClickListenerC55457OkB.A01(inflate, 16, this);
                AbstractC167007dF.A0N(inflate, R.id.title).setText(2131952285);
                this.A01 = AbstractC166997dE.A0T(inflate, R.id.sub_title);
                if (AbstractC25226BEj.A1b(this.A04)) {
                    TextView textView = this.A01;
                    if (textView != null) {
                        textView.setText(((BrandedContentTag) this.A04.get(0)).A02);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                LL0.A02(this, getSession(), C05F.A0F, C05F.A04, C05F.A00);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        EditText editText = this.A00;
        if (editText == null) {
            str = "editText";
        } else {
            C55346Oi6.A01(editText, this, 3);
            IgButton igButton2 = this.A06;
            if (igButton2 != null) {
                ViewOnClickListenerC55457OkB.A01(igButton2, 17, this);
                A03(this);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final String A00(C52172N7c c52172N7c) {
        EditText editText = c52172N7c.A00;
        if (editText != null) {
            if (editText.getEditableText() == null) {
                return "";
            }
            EditText editText2 = c52172N7c.A00;
            if (editText2 != null) {
                return editText2.getEditableText().toString();
            }
        }
        C14360o3.A0F("editText");
        throw C00O.createAndThrow();
    }

    public static final void A01(C52172N7c c52172N7c) {
        InterfaceC57937Pmh interfaceC57937Pmh = c52172N7c.A03;
        if (interfaceC57937Pmh != null) {
            interfaceC57937Pmh.DPJ(A00(c52172N7c), c52172N7c.A04);
            EditText editText = c52172N7c.A00;
            if (editText == null) {
                C14360o3.A0F("editText");
                throw C00O.createAndThrow();
            }
            AbstractC13880nE.A0O(editText);
            C3DN A01 = C3DN.A00.A01(c52172N7c.requireContext());
            if (A01 != null) {
                A01.A0B();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A03(C52172N7c c52172N7c) {
        String A00;
        boolean z = false;
        if (c52172N7c.A04.isEmpty() && ((A00 = A00(c52172N7c)) == null || A00.length() == 0)) {
            z = true;
        }
        IgButton igButton = c52172N7c.A06;
        if (igButton != null) {
            igButton.setEnabled(!z);
            IgButton igButton2 = c52172N7c.A06;
            if (igButton2 != null) {
                float f = 1.0f;
                if (z) {
                    f = 0.5f;
                }
                igButton2.setAlpha(f);
                return;
            }
        }
        C14360o3.A0F("submitButton");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_title_composer";
    }

    public static final void A02(C52172N7c c52172N7c) {
        BrandedContentTag brandedContentTag;
        Bundle A0b = AbstractC166987dD.A0b();
        if (AbstractC25226BEj.A1b(c52172N7c.A04)) {
            brandedContentTag = (BrandedContentTag) c52172N7c.A04.get(0);
        } else {
            brandedContentTag = null;
        }
        A0b.putParcelable("BRANDED_CONTENT_TAG", brandedContentTag);
        A0b.putParcelableArrayList(AbstractC111324zv.A00(3508), c52172N7c.A04);
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "live_composer_details");
        AbstractC31173DnH.A0Z(c52172N7c.requireActivity(), A0b, c52172N7c.getSession(), ModalActivity.class, AbstractC111324zv.A00(4840)).A0D(c52172N7c, 75);
        LL0.A02(c52172N7c, c52172N7c.getSession(), C05F.A0H, C05F.A04, C05F.A00);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 75 && i2 == -1 && intent != null) {
            BrandedContentTag brandedContentTag = (BrandedContentTag) intent.getParcelableExtra("BRANDED_CONTENT_TAG");
            TextView textView = this.A01;
            if (textView != null) {
                if (brandedContentTag != null && (str = brandedContentTag.A02) != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    this.A04 = A1E;
                    A1E.add(brandedContentTag);
                    AbstractC31177DnL.A10(textView, this, str, 2131974338);
                } else {
                    this.A04 = AbstractC166987dD.A1E();
                    textView.setText(2131964140);
                }
                A03(this);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(526550670);
        super.onCreate(bundle);
        setModuleNameV2("live_title_composer");
        this.A04 = AbstractC166987dD.A1E();
        AbstractC25651Mw.A00(getSession()).A01(this.A07, C56021Ots.class);
        this.A02 = new AnonymousClass857(AbstractC31172DnG.A04(this));
        C0f9.A09(629440809, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(29433226);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_iglive_title_entry, false);
        C0f9.A09(-1185602491, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(73844005);
        super.onDestroy();
        AbstractC25651Mw.A00(getSession()).A02(this.A07, C56021Ots.class);
        C0f9.A09(1960310882, A02);
    }
}
