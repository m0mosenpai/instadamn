package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* loaded from: classes8.dex */
public final class KC3 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "PrimerBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public PrimerBottomSheetConfig A02;
    public CharSequence A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        PrimerBottomSheetConfig primerBottomSheetConfig = this.A02;
        if (primerBottomSheetConfig == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        if (primerBottomSheetConfig.A0E) {
            return false;
        }
        return isVisible();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        PrimerBottomSheetConfig primerBottomSheetConfig = (PrimerBottomSheetConfig) requireArguments().getParcelable("arg_config");
        if (primerBottomSheetConfig != null) {
            return primerBottomSheetConfig.A0A;
        }
        return __redex_internal_original_name;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1225709233);
        super.onCreate(bundle);
        this.A02 = (PrimerBottomSheetConfig) AbstractC153636vY.A00(requireArguments(), PrimerBottomSheetConfig.class, "arg_config");
        C0f9.A09(1628438356, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int paddingStart;
        int paddingTop;
        int paddingEnd;
        int paddingBottom;
        int A02 = C0f9.A02(1307353795);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.primer_bottom_sheet, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        PrimerBottomSheetConfig primerBottomSheetConfig = this.A02;
        if (primerBottomSheetConfig != null) {
            TitleIcon titleIcon = primerBottomSheetConfig.A01;
            if (titleIcon != null) {
                Context requireContext = requireContext();
                Drawable drawable = requireContext.getDrawable(titleIcon.A00);
                if (drawable != null) {
                    ColorTint colorTint = titleIcon.A01;
                    if (colorTint != null && colorTint.A02 == 0) {
                        drawable = C3LQ.A03(requireContext, drawable, requireContext.getColor(colorTint.A01), requireContext.getColor(colorTint.A00));
                    }
                    A0g.setImageDrawable(drawable);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            PrimerBottomSheetConfig primerBottomSheetConfig2 = this.A02;
            if (primerBottomSheetConfig2 != null) {
                A0g.setHeadline(primerBottomSheetConfig2.A00);
                Resources A0M = AbstractC25228BEl.A0M(A0g);
                PrimerBottomSheetConfig primerBottomSheetConfig3 = this.A02;
                if (primerBottomSheetConfig3 != null) {
                    Integer num = primerBottomSheetConfig3.A04;
                    Integer num2 = primerBottomSheetConfig3.A05;
                    Integer num3 = primerBottomSheetConfig3.A03;
                    Integer num4 = primerBottomSheetConfig3.A02;
                    if (num != null) {
                        paddingStart = A0M.getDimensionPixelSize(num.intValue());
                    } else {
                        paddingStart = A0g.getPaddingStart();
                    }
                    if (num2 != null) {
                        paddingTop = A0M.getDimensionPixelSize(num2.intValue());
                    } else {
                        paddingTop = A0g.getPaddingTop();
                    }
                    if (num3 != null) {
                        paddingEnd = A0M.getDimensionPixelSize(num3.intValue());
                    } else {
                        paddingEnd = A0g.getPaddingEnd();
                    }
                    if (num4 != null) {
                        paddingBottom = A0M.getDimensionPixelSize(num4.intValue());
                    } else {
                        paddingBottom = A0g.getPaddingBottom();
                    }
                    A0g.setPadding(paddingStart, paddingTop, paddingEnd, paddingBottom);
                    PrimerBottomSheetConfig primerBottomSheetConfig4 = this.A02;
                    if (primerBottomSheetConfig4 != null) {
                        Integer num5 = primerBottomSheetConfig4.A08;
                        if (num5 != null) {
                            A0g.setBody(num5.intValue());
                        }
                        PrimerBottomSheetConfig primerBottomSheetConfig5 = this.A02;
                        if (primerBottomSheetConfig5 != null) {
                            if (primerBottomSheetConfig5.A0G) {
                                AbstractC31172DnG.A1J(inflate, R.id.headline_divider, 0);
                            }
                            PrimerBottomSheetConfig primerBottomSheetConfig6 = this.A02;
                            if (primerBottomSheetConfig6 != null) {
                                String str = primerBottomSheetConfig6.A09;
                                if (str != null) {
                                    TextView A0N = AbstractC167007dF.A0N(inflate, R.id.main_body_text);
                                    A0N.setText(str);
                                    A0N.setVisibility(0);
                                    AbstractC31176DnK.A1D(inflate, R.id.item_list_divider);
                                }
                                RecyclerView A0G = AbstractC31172DnG.A0G(inflate, R.id.info_list);
                                PrimerBottomSheetConfig primerBottomSheetConfig7 = this.A02;
                                if (primerBottomSheetConfig7 != null) {
                                    A0G.setAdapter(new Jnp(primerBottomSheetConfig7.A06, primerBottomSheetConfig7.A07, primerBottomSheetConfig7.A0D));
                                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.primer_bottom_button);
                                    PrimerBottomSheetConfig primerBottomSheetConfig8 = this.A02;
                                    if (primerBottomSheetConfig8 != null) {
                                        igdsBottomButtonLayout.setPrimaryActionText(primerBottomSheetConfig8.A0B);
                                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(this.A00);
                                        PrimerBottomSheetConfig primerBottomSheetConfig9 = this.A02;
                                        if (primerBottomSheetConfig9 != null) {
                                            igdsBottomButtonLayout.setSecondaryActionText(primerBottomSheetConfig9.A0C);
                                            igdsBottomButtonLayout.setSecondaryActionOnClickListener(this.A01);
                                            PrimerBottomSheetConfig primerBottomSheetConfig10 = this.A02;
                                            if (primerBottomSheetConfig10 != null) {
                                                boolean z = primerBottomSheetConfig10.A0F;
                                                CharSequence charSequence = this.A03;
                                                if (z) {
                                                    igdsBottomButtonLayout.setFooterText(charSequence);
                                                } else {
                                                    igdsBottomButtonLayout.setFooterAboveActionText(charSequence);
                                                }
                                                C0f9.A09(1928993386, A02);
                                                return inflate;
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
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }
}
