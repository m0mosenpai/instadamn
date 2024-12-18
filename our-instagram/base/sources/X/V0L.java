package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes11.dex */
public final class V0L extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteSimpleErrorFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public ErrorIdentifier A03;
    public IgdsBottomButtonLayout A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(450);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x006e. Please report as an issue. */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int i;
        IgdsBottomButtonLayout igdsBottomButtonLayout2;
        String string;
        int i2;
        BaseFragmentActivity baseFragmentActivity;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0U = AbstractC167017dG.A0U(view, R.id.promote_empty_view_stub);
        this.A00 = A0U;
        String str = "errorView";
        if (A0U != null) {
            this.A02 = (TextView) A0U.requireViewById(R.id.promote_empty_view_title);
            View view2 = this.A00;
            if (view2 != null) {
                this.A01 = (TextView) view2.requireViewById(R.id.promote_empty_view_description);
                this.A04 = (IgdsBottomButtonLayout) view.requireViewById(R.id.action_bottom_button);
                FragmentActivity requireActivity = requireActivity();
                if ((requireActivity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) requireActivity) != null) {
                    baseFragmentActivity.A0a();
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A04;
                String str2 = "buttonView";
                if (igdsBottomButtonLayout3 != null) {
                    igdsBottomButtonLayout3.setPrimaryActionText(getString(2131970726));
                    ErrorIdentifier errorIdentifier = this.A03;
                    if (errorIdentifier == null) {
                        str2 = "errorIdentifier";
                    } else {
                        switch (errorIdentifier.ordinal()) {
                            case 45:
                                A01();
                                TextView textView = this.A01;
                                if (textView != null) {
                                    textView.setText(A00());
                                    TextView textView2 = this.A01;
                                    if (textView2 != null) {
                                        AbstractC25227BEk.A11(textView2);
                                        igdsBottomButtonLayout = this.A04;
                                        if (igdsBottomButtonLayout != null) {
                                            i = 48;
                                            igdsBottomButtonLayout.setPrimaryActionOnClickListener(new ViewOnClickListenerC48064LPp(this, i));
                                            return;
                                        }
                                    }
                                }
                                C14360o3.A0F("errorViewDescription");
                                throw C00O.createAndThrow();
                            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                                A01();
                                TextView textView3 = this.A01;
                                if (textView3 != null) {
                                    textView3.setText(2131970720);
                                    igdsBottomButtonLayout = this.A04;
                                    if (igdsBottomButtonLayout != null) {
                                        i = 49;
                                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new ViewOnClickListenerC48064LPp(this, i));
                                        return;
                                    }
                                }
                                C14360o3.A0F("errorViewDescription");
                                throw C00O.createAndThrow();
                            case 47:
                            case 48:
                            case 49:
                            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                            case 51:
                            default:
                                TextView textView4 = this.A02;
                                if (textView4 == null) {
                                    str2 = "errorViewTitle";
                                    break;
                                } else {
                                    textView4.setText(2131970729);
                                    IgdsBottomButtonLayout igdsBottomButtonLayout4 = this.A04;
                                    if (igdsBottomButtonLayout4 != null) {
                                        igdsBottomButtonLayout4.setVisibility(8);
                                        return;
                                    }
                                }
                                break;
                            case 52:
                                A01();
                                TextView textView5 = this.A01;
                                if (textView5 != null) {
                                    textView5.setText(A00());
                                    TextView textView6 = this.A01;
                                    if (textView6 != null) {
                                        AbstractC25227BEk.A11(textView6);
                                        IgdsBottomButtonLayout igdsBottomButtonLayout5 = this.A04;
                                        if (igdsBottomButtonLayout5 != null) {
                                            ViewOnClickListenerC48064LPp.A00(igdsBottomButtonLayout5, 44, this);
                                            return;
                                        }
                                    }
                                }
                                C14360o3.A0F("errorViewDescription");
                                throw C00O.createAndThrow();
                            case 53:
                                A01();
                                TextView textView7 = this.A01;
                                if (textView7 != null) {
                                    String A0v = AbstractC25227BEk.A0v(this, 2131970717);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MSZ.A0q(this, A0v, 2131970716));
                                    View view3 = this.A00;
                                    if (view3 != null) {
                                        Context context = view3.getContext();
                                        AnonymousClass773.A05(spannableStringBuilder, new C46061KaI(this, context.getColor(AbstractC53242c7.A06(context)), 0), A0v);
                                        textView7.setText(spannableStringBuilder);
                                        TextView textView8 = this.A01;
                                        if (textView8 != null) {
                                            AbstractC25227BEk.A11(textView8);
                                            IgdsBottomButtonLayout igdsBottomButtonLayout6 = this.A04;
                                            if (igdsBottomButtonLayout6 != null) {
                                                ViewOnClickListenerC48064LPp.A00(igdsBottomButtonLayout6, 45, this);
                                                IgdsBottomButtonLayout igdsBottomButtonLayout7 = this.A04;
                                                if (igdsBottomButtonLayout7 != null) {
                                                    igdsBottomButtonLayout7.setPrimaryActionText(getString(2131970722));
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F("errorViewDescription");
                                throw C00O.createAndThrow();
                            case 54:
                                TextView textView9 = this.A02;
                                if (textView9 != null) {
                                    textView9.setText(2131970288);
                                    String string2 = getString(2131970285);
                                    String string3 = getString(2131970286);
                                    TextView textView10 = this.A01;
                                    if (textView10 != null) {
                                        textView10.setText(AnonymousClass001.A0g(string2, "\n\n", string3));
                                        igdsBottomButtonLayout2 = this.A04;
                                        if (igdsBottomButtonLayout2 != null) {
                                            string = getString(2131970287);
                                            i2 = 46;
                                            igdsBottomButtonLayout2.setPrimaryAction(string, new ViewOnClickListenerC48064LPp(this, i2));
                                            return;
                                        }
                                    }
                                    C14360o3.A0F("errorViewDescription");
                                    throw C00O.createAndThrow();
                                }
                                str = "errorViewTitle";
                                break;
                            case 55:
                                TextView textView11 = this.A02;
                                if (textView11 != null) {
                                    textView11.setText(2131970288);
                                    String string4 = getString(2131970400);
                                    String string5 = getString(2131970401);
                                    TextView textView12 = this.A01;
                                    if (textView12 != null) {
                                        textView12.setText(AnonymousClass001.A0g(string4, "\n\n", string5));
                                        igdsBottomButtonLayout2 = this.A04;
                                        if (igdsBottomButtonLayout2 != null) {
                                            string = getString(2131970287);
                                            i2 = 47;
                                            igdsBottomButtonLayout2.setPrimaryAction(string, new ViewOnClickListenerC48064LPp(this, i2));
                                            return;
                                        }
                                    }
                                    C14360o3.A0F("errorViewDescription");
                                    throw C00O.createAndThrow();
                                }
                                str = "errorViewTitle";
                                break;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A01() {
        TextView textView = this.A02;
        if (textView == null) {
            C14360o3.A0F("errorViewTitle");
            throw C00O.createAndThrow();
        }
        textView.setText(2131970728);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A05.getValue();
    }

    private final SpannableStringBuilder A00() {
        String A0v = AbstractC25227BEk.A0v(this, 2131970717);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MSZ.A0q(this, A0v, 2131970718));
        View view = this.A00;
        if (view == null) {
            C14360o3.A0F("errorView");
            throw C00O.createAndThrow();
        }
        Context context = view.getContext();
        AnonymousClass773.A05(spannableStringBuilder, new C46061KaI(this, context.getColor(AbstractC53242c7.A06(context)), 1), A0v);
        return spannableStringBuilder;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Context A05 = AbstractC31176DnK.A05(this, interfaceC56362iU);
        ErrorIdentifier errorIdentifier = this.A03;
        if (errorIdentifier == null) {
            C14360o3.A0F("errorIdentifier");
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.setTitle(AbstractC68463VRt.A00(A05, errorIdentifier));
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-294018745);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(AbstractC153636vY.A01(bundle2, "error_type"));
        if (errorIdentifier == null) {
            errorIdentifier = ErrorIdentifier.A19;
        }
        this.A03 = errorIdentifier;
        C0f9.A09(-39734461, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1397784179);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_error_view, false);
        C0f9.A09(2143316020, A02);
        return A0R;
    }
}
