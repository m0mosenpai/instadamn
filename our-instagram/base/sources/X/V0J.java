package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0J extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromotePreviewTemplateSelectionFragment";
    public C70399WUb A00;
    public List A01;
    public KEF A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_preview_template_selection_fragment";
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, X.VIy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0ps, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC65703TsZ.A1K(this);
        Context requireContext = requireContext();
        UserSession userSession = (UserSession) this.A03.getValue();
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            this.A02 = new KEF(requireContext, abstractC10360h2, userSession);
            RecyclerView A08 = AbstractC31180DnO.A08(view);
            KEF kef = this.A02;
            String str = "viewAdapter";
            if (kef != null) {
                A08.setAdapter(kef);
                AbstractC31174DnI.A15(getContext(), A08);
                KEF kef2 = this.A02;
                if (kef2 != null) {
                    kef2.A00.clear();
                    kef2.clear();
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    List list = this.A01;
                    if (list != null) {
                        int size = list.size();
                        int i = 0;
                        String str2 = null;
                        SimpleImageUrl simpleImageUrl = null;
                        boolean z = false;
                        while (true) {
                            if (i < size) {
                                List list2 = this.A01;
                                if (list2 == null) {
                                    break;
                                }
                                EnumC68192VFk enumC68192VFk = ((C69216Vjj) list2.get(i)).A00;
                                if (enumC68192VFk != null) {
                                    int ordinal = enumC68192VFk.ordinal();
                                    if (ordinal != 1) {
                                        if (ordinal != 3) {
                                            if (ordinal == 2) {
                                                z = true;
                                            }
                                        } else {
                                            List list3 = this.A01;
                                            if (list3 == null) {
                                                break;
                                            }
                                            String str3 = ((C69216Vjj) list3.get(i)).A03;
                                            if (str3 != null) {
                                                simpleImageUrl = new SimpleImageUrl(str3);
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                    } else {
                                        List list4 = this.A01;
                                        if (list4 == null) {
                                            break;
                                        }
                                        obj3.A00 = ((C69216Vjj) list4.get(i)).A03;
                                        List list5 = this.A01;
                                        if (list5 == null) {
                                            break;
                                        }
                                        obj2.A00 = ((C69216Vjj) list5.get(i)).A02;
                                        List list6 = this.A01;
                                        if (list6 == null) {
                                            break;
                                        } else {
                                            str2 = ((C69216Vjj) list6.get(i)).A01;
                                        }
                                    }
                                }
                                i++;
                            } else {
                                if (obj3.A00 != null && (obj = obj2.A00) != null && simpleImageUrl != null) {
                                    KEF kef3 = this.A02;
                                    if (kef3 != null) {
                                        kef3.A00.add(new C69343Vlp(new WNX(22, (Object) obj2, this, (Object) obj3), this, simpleImageUrl, (CharSequence) obj, str2, C05F.A0C));
                                    }
                                }
                                List list7 = this.A01;
                                if (list7 != null) {
                                    int size2 = list7.size();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < size2) {
                                            if (z) {
                                                KEF kef4 = this.A02;
                                                if (kef4 == null) {
                                                    break;
                                                }
                                                Integer num = C05F.A01;
                                                ?? obj4 = new Object();
                                                obj4.A00 = num;
                                                kef4.A00.add(obj4);
                                                KEF kef5 = this.A02;
                                                if (kef5 == null) {
                                                    break;
                                                }
                                                kef5.A00.add(new C69343Vlp(WNK.A00, this, null, AbstractC166997dE.A0p(requireContext(), 2131970870), null, C05F.A00));
                                                KEF kef6 = this.A02;
                                                if (kef6 == null) {
                                                    break;
                                                }
                                                kef6.A00.add(new C69343Vlp(WNL.A00, this, null, AbstractC166997dE.A0p(requireContext(), 2131970871), null, num));
                                                z = false;
                                            }
                                            List list8 = this.A01;
                                            if (list8 == null) {
                                                break;
                                            }
                                            EnumC68192VFk enumC68192VFk2 = ((C69216Vjj) list8.get(i2)).A00;
                                            if (enumC68192VFk2 != null && enumC68192VFk2.ordinal() == 2) {
                                                KEF kef7 = this.A02;
                                                if (kef7 == null) {
                                                    break;
                                                }
                                                Integer num2 = C05F.A0N;
                                                List list9 = this.A01;
                                                if (list9 == null) {
                                                    break;
                                                }
                                                String str4 = ((C69216Vjj) list9.get(i2)).A02;
                                                if (str4 != null) {
                                                    kef7.A00.add(new C69343Vlp(new WMR(this, i2, 1), this, null, str4, null, num2));
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                            i2++;
                                        } else {
                                            KEF kef8 = this.A02;
                                            if (kef8 != null) {
                                                kef8.A00();
                                                C70399WUb c70399WUb = this.A00;
                                                if (c70399WUb == null) {
                                                    str = "logger";
                                                } else {
                                                    AbstractC65702TsY.A1M(c70399WUb, VG4.A09);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("listOfPreviewInfo");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(V0J v0j, String str) {
        if (str != null) {
            C69798Vvi A02 = AbstractC155756z4.A00().A02();
            InterfaceC09390do interfaceC09390do = v0j.A03;
            UserSession userSession = (UserSession) interfaceC09390do.getValue();
            v0j.requireActivity();
            AbstractC31179DnN.A0y(A02.A00(userSession, str), v0j.requireActivity(), interfaceC09390do);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A03.getValue();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131970828);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        List arrayList;
        int A02 = C0f9.A02(-782051116);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("instagram_positions");
        } else {
            str = null;
        }
        AbstractC68362VNw.A00(String.valueOf(str));
        Gson gson = new Gson();
        Type type = new C67782Uy7().A00;
        C14360o3.A07(type);
        try {
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str2 = bundle3.getString("preview_info");
            }
            arrayList = (List) gson.A09(String.valueOf(str2), type);
        } catch (C90063zm unused) {
            arrayList = new ArrayList();
        }
        this.A01 = arrayList;
        this.A00 = AbstractC43594JPz.A0N(this.A03);
        C0f9.A09(-1255945455, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(561437411);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_fragment, false);
        C0f9.A09(1734540803, A02);
        return A0R;
    }
}
