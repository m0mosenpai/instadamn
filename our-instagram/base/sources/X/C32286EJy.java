package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.EJy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32286EJy extends AbstractC59962oe implements InterfaceC60122ou, CallerContextable {
    public static final String __redex_internal_original_name = "PersonalInformationFragment";
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public CardView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgdsBanner A08;
    public IgdsBanner A09;
    public IgFormField A0A;
    public IgFormField A0B;
    public IgFormField A0C;
    public IgFormField A0D;
    public C34649FOh A0E;
    public C35016Fbp A0F;
    public ImageWithTitleTextView A0G;
    public ImageWithTitleTextView A0H;
    public ImageWithTitleTextView A0I;
    public String A0J;
    public boolean A0K;
    public final InterfaceC41501vz A0M = new C36155FxU(this, 5);
    public final InterfaceC09390do A0L = AbstractC60492pY.A02(this);

    public static final void A01(C32286EJy c32286EJy, boolean z) {
        View view = c32286EJy.A02;
        String str = "rootView";
        if (view != null) {
            AbstractC31176DnK.A1D(view, R.id.personal_info_fields);
            View view2 = c32286EJy.A02;
            if (view2 != null) {
                AbstractC31172DnG.A1J(view2, R.id.loading_spinner, 0);
                if (!z) {
                    View view3 = c32286EJy.A01;
                    if (view3 == null) {
                        str = "retryRequestButton";
                    } else {
                        view3.setVisibility(8);
                    }
                }
                C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC25230BEn.A0k(c32286EJy.A0L, 0));
                A0M.A0B(AbstractC111324zv.A00(1880));
                A0M.A9s("edit", "true");
                A0M.A9s("ig_personal_info", "true");
                C31702Dw7.A00(c32286EJy, AbstractC25227BEk.A0e(A0M, ECB.class, FY2.class), 22);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969545);
        ActionButton Eha = interfaceC56362iU.Eha(ViewOnClickListenerC31723DwS.A00(this, 37), R.drawable.instagram_arrow_cw_pano_outline_24);
        this.A01 = Eha;
        Eha.setVisibility(8);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "personal_information";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A01(this, true);
        if (this.A0K) {
            InterfaceC09390do interfaceC09390do = this.A0L;
            if (!AbstractC25230BEn.A0l(interfaceC09390do).A01.getBoolean("age_collection_updated_age_from_linked_fb_dialog_shown", false)) {
                FragmentActivity requireActivity = requireActivity();
                UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 1);
                C193328hC A0H = AbstractC31171DnF.A0H(requireActivity);
                A0H.A0A(2131977013);
                A0H.A09(2131977012);
                A0H.A0F(new DialogInterfaceOnClickListenerC35301Fha(12));
                A0H.A0H(DialogInterfaceOnClickListenerC35455FkC.A00(requireActivity, A0K, 52), 2131965052);
                AbstractC166987dD.A1W(A0H);
                AbstractC31177DnL.A1N(AbstractC166987dD.A0x(A0K), "age_collection_updated_age_from_linked_fb_dialog_shown", true);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0L);
    }

    public static final void A00(C32286EJy c32286EJy) {
        FragmentActivity activity = c32286EJy.getActivity();
        if (activity != null) {
            C140966Yy A0c = AbstractC25231BEo.A0c(activity, c32286EJy.A0L);
            AbstractC31364DqT.A03();
            C34649FOh c34649FOh = c32286EJy.A0E;
            if (c34649FOh == null) {
                C14360o3.A0F("userForEditing");
                throw C00O.createAndThrow();
            }
            Date date = c34649FOh.A0P;
            C32274EJj c32274EJj = new C32274EJj();
            if (date != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putInt("EditBirthdayFragment.ARG_BIRTHDAY_YEAR", calendar.get(1));
                A0b.putInt("EditBirthdayFragment.ARG_BIRTHDAY_MONTH", calendar.get(2));
                A0b.putInt("EditBirthdayFragment.ARG_BIRTHDAY_DAY", AbstractC31173DnH.A05(calendar));
                c32274EJj.setArguments(A0b);
            }
            A0c.A0D(c32274EJj);
            A0c.A04();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-355610028);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0L;
        this.A0K = AbstractC49092Nc.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(CallerContext.A00(C32286EJy.class), "ig_age_collection");
        this.A0F = new C35016Fbp(AbstractC166987dD.A0r(interfaceC09390do));
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0M, C36106Fwg.class);
        C0f9.A09(-314037144, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1482336972);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_personal_information, viewGroup, false);
        this.A02 = inflate;
        String str = "rootView";
        if (inflate != null) {
            this.A00 = inflate.requireViewById(R.id.loading_spinner);
            View view = this.A02;
            if (view != null) {
                this.A0B = AbstractC31172DnG.A0k(view, R.id.email);
                View view2 = this.A02;
                if (view2 != null) {
                    this.A0H = (ImageWithTitleTextView) view2.requireViewById(R.id.confirm_your_email);
                    View view3 = this.A02;
                    if (view3 != null) {
                        this.A0D = AbstractC31172DnG.A0k(view3, R.id.phone);
                        View view4 = this.A02;
                        if (view4 != null) {
                            this.A0I = (ImageWithTitleTextView) view4.requireViewById(R.id.confirm_your_phone_number);
                            View view5 = this.A02;
                            if (view5 != null) {
                                this.A0C = AbstractC31172DnG.A0k(view5, R.id.gender);
                                View view6 = this.A02;
                                if (view6 != null) {
                                    this.A03 = AbstractC31173DnH.A0F(view6, R.id.birthday_container);
                                    View view7 = this.A02;
                                    if (view7 != null) {
                                        this.A0A = AbstractC31172DnG.A0k(view7, R.id.birthday);
                                        View view8 = this.A02;
                                        if (view8 != null) {
                                            this.A04 = AbstractC166997dE.A0T(view8, R.id.update_birthday_on_facebook);
                                            View view9 = this.A02;
                                            if (view9 != null) {
                                                this.A0G = (ImageWithTitleTextView) view9.requireViewById(R.id.verify_your_age_button);
                                                View view10 = this.A02;
                                                if (view10 != null) {
                                                    this.A05 = (CardView) view10.requireViewById(R.id.ac_transition_banner_container);
                                                    View view11 = this.A02;
                                                    if (view11 != null) {
                                                        this.A06 = AbstractC31172DnG.A0X(view11, R.id.content_text);
                                                        View view12 = this.A02;
                                                        if (view12 != null) {
                                                            this.A07 = AbstractC31172DnG.A0X(view12, R.id.learn_more_link);
                                                            View view13 = this.A02;
                                                            if (view13 != null) {
                                                                IgdsBanner igdsBanner = (IgdsBanner) view13.requireViewById(R.id.personal_info_description);
                                                                this.A08 = igdsBanner;
                                                                if (igdsBanner == null) {
                                                                    str = DevServerEntity.COLUMN_DESCRIPTION;
                                                                } else {
                                                                    igdsBanner.setVisibility(0);
                                                                    View view14 = this.A02;
                                                                    if (view14 != null) {
                                                                        IgdsBanner igdsBanner2 = (IgdsBanner) view14.requireViewById(R.id.personal_info_security);
                                                                        this.A09 = igdsBanner2;
                                                                        if (igdsBanner2 == null) {
                                                                            str = "security_description";
                                                                        } else {
                                                                            igdsBanner2.setVisibility(0);
                                                                            View view15 = this.A02;
                                                                            if (view15 != null) {
                                                                                C0f9.A09(2116893582, A02);
                                                                                return view15;
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
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(527143950);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A0L).A02(this.A0M, C36106Fwg.class);
        C0f9.A09(-327829562, A02);
    }
}
