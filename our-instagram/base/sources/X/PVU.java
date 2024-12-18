package X;

import com.facebook.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PVU implements InterfaceC19960yQ {
    public final /* synthetic */ OHs A00;
    public final /* synthetic */ N6J A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public PVU(OHs oHs, N6J n6j, List list, boolean z, boolean z2, boolean z3) {
        this.A01 = n6j;
        this.A05 = z;
        this.A02 = list;
        this.A00 = oHs;
        this.A04 = z2;
        this.A03 = z3;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List list;
        C51733MtG c51733MtG = (C51733MtG) obj;
        N6J n6j = this.A01;
        C22C A0K = MSX.A0K(n6j);
        C81X c81x = C81X.A18;
        EnumC114925Hg enumC114925Hg = EnumC114925Hg.CLIPS;
        A0K.A15(enumC114925Hg, c81x);
        if (this.A05) {
            if (c51733MtG.A06) {
                MSX.A0K(n6j).A15(enumC114925Hg, C81X.A0F);
                List list2 = this.A02;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (MSW.A0J(it).A01 instanceof NHL) {
                            break;
                        }
                    }
                }
                list2.add(0, new C51757Mtg(NHL.A00, AbstractC43592JPx.A0r(R.drawable.instagram_edit_gen_ai_pano_outline_12)));
            } else {
                List list3 = this.A02;
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C51757Mtg A0J = MSW.A0J(it2);
                    if (A0J.A01 instanceof NHL) {
                        list3.remove(A0J);
                        break;
                    }
                }
            }
        }
        List list4 = this.A02;
        boolean z = list4 instanceof Collection;
        if (!z || !list4.isEmpty()) {
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                if (MSW.A0J(it3).A01 instanceof NHJ) {
                    break;
                }
            }
        }
        list4.add(new C51757Mtg(NHJ.A00, AbstractC43592JPx.A0r(R.drawable.instagram_hashtag_pano_outline_12), n6j.requireContext().getString(2131955810)));
        C51122MiR c51122MiR = this.A00.A00;
        c51122MiR.A00 = list4;
        c51122MiR.notifyDataSetChanged();
        if (this.A04) {
            if (c51733MtG.A02) {
                MSX.A0K(n6j).A15(enumC114925Hg, C81X.A0f);
                if (!z || !list4.isEmpty()) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        if (MSW.A0J(it4).A01 instanceof NHK) {
                            break;
                        }
                    }
                }
                list4.add(new C51757Mtg(NHK.A00, AbstractC43592JPx.A0r(R.drawable.instagram_poll_pano_outline_12)));
            } else {
                Iterator it5 = list4.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    C51757Mtg A0J2 = MSW.A0J(it5);
                    if (A0J2.A01 instanceof NHK) {
                        list4.remove(A0J2);
                        break;
                    }
                }
            }
            boolean z2 = c51733MtG.A03;
            OFX ofx = n6j.A06;
            if (z2) {
                if (ofx != null) {
                    ofx.A04.setVisibility(0);
                    C101394gx c101394gx = (C101394gx) c51733MtG.A01;
                    if (c101394gx != null && (list = c101394gx.A0F) != null) {
                        OFX ofx2 = n6j.A06;
                        if (ofx2 != null) {
                            AbstractC31177DnL.A0r(n6j.requireContext(), ofx2.A04, AbstractC43592JPx.A0r(list.size()), 2131969723);
                        }
                    }
                    OFX ofx3 = n6j.A06;
                    if (ofx3 != null) {
                        ViewOnClickListenerC55462OkH.A01(ofx3.A04, 56, n6j);
                    }
                }
            } else if (ofx != null) {
                ofx.A04.setVisibility(8);
            }
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        if (this.A03) {
            if (c51733MtG.A05) {
                if (!z || !list4.isEmpty()) {
                    Iterator it6 = list4.iterator();
                    while (it6.hasNext()) {
                        if (MSW.A0J(it6).A01 instanceof NHI) {
                            break;
                        }
                    }
                }
                list4.add(new C51757Mtg(NHI.A00, AbstractC43592JPx.A0r(R.drawable.instagram_comment_outline_12), n6j.requireContext().getString(2131956471)));
            } else {
                Iterator it7 = list4.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    C51757Mtg A0J3 = MSW.A0J(it7);
                    if (A0J3.A01 instanceof NHI) {
                        list4.remove(A0J3);
                        break;
                    }
                }
            }
            boolean z3 = c51733MtG.A04;
            OFX ofx4 = n6j.A06;
            if (z3) {
                if (ofx4 != null) {
                    ofx4.A05.setVisibility(0);
                    OFX ofx5 = n6j.A06;
                    if (ofx5 != null) {
                        ViewOnClickListenerC55462OkH.A01(ofx5.A05, 57, n6j);
                    }
                }
            } else if (ofx4 != null) {
                ofx4.A05.setVisibility(8);
            }
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        if (list4.isEmpty()) {
            OFX ofx6 = n6j.A06;
            if (ofx6 != null) {
                ofx6.A06.setVisibility(8);
                return C0eB.A00;
            }
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        C51122MiR c51122MiR2 = this.A00.A00;
        c51122MiR2.A00 = list4;
        c51122MiR2.notifyDataSetChanged();
        OFX ofx7 = n6j.A06;
        if (ofx7 != null) {
            ofx7.A06.setVisibility(0);
            return C0eB.A00;
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }
}
