package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Bcz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25898Bcz extends C2UU {
    public final Activity A00;
    public final C07X A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C57112jm A04;
    public final C38321qM A05;
    public final C27099BxO A06;
    public final List A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC16660sJ A09;
    public final InterfaceC16620sF A0A;
    public final boolean A0B;

    public C25898Bcz(Activity activity, C07X c07x, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C38321qM c38321qM, C27099BxO c27099BxO, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, boolean z) {
        AbstractC167007dF.A1F(userSession, 3, c57112jm);
        C14360o3.A0B(c38321qM, 6);
        this.A02 = interfaceC11380iw;
        this.A00 = activity;
        this.A03 = userSession;
        this.A04 = c57112jm;
        this.A06 = c27099BxO;
        this.A05 = c38321qM;
        this.A07 = list;
        this.A01 = c07x;
        this.A08 = interfaceC16660sJ;
        this.A09 = interfaceC16660sJ2;
        this.A0A = interfaceC16620sF;
        this.A0B = z;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        View inflate;
        C14360o3.A0B(viewGroup, 0);
        if (i == 4) {
            inflate = new IgdsPeopleCell(AbstractC166997dE.A0L(viewGroup), false);
        } else {
            Context A0L = AbstractC166997dE.A0L(viewGroup);
            switch (i) {
                case 1:
                    i2 = R.layout.recipe_item_music;
                    break;
                case 2:
                    i2 = R.layout.recipe_item_effect;
                    break;
                case 3:
                    i2 = R.layout.recipe_item_remix;
                    break;
                case 4:
                default:
                    throw AbstractC25230BEn.A0n("Unknown View Type ID: ", i);
                case 5:
                    i2 = R.layout.recipe_item_layout;
                    break;
                case 6:
                    i2 = R.layout.recipe_item_child_association;
                    break;
                case 7:
                    boolean A01 = BO8.A01(A0L, this.A03);
                    i2 = R.layout.recipe_item_location;
                    if (A01) {
                        i2 = R.layout.recipe_item_location_v2;
                        break;
                    }
                    break;
                case 8:
                    i2 = R.layout.recipe_item_cutout_sticker;
                    break;
                case 9:
                    i2 = R.layout.recipe_item_template;
                    break;
                case 10:
                    i2 = R.layout.recipe_item_meta_verified_link;
                    break;
                case 11:
                    i2 = R.layout.recipe_item_app_more_info;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    i2 = R.layout.recipe_item_gen_ai_label;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    i2 = R.layout.recipe_item_business_category;
                    break;
                case 14:
                    i2 = R.layout.recipe_item_generic_item;
                    break;
                case Process.SIGTERM /* 15 */:
                    i2 = R.layout.recipe_item_bio_product_label;
                    break;
            }
            inflate = LayoutInflater.from(A0L).inflate(i2, viewGroup, false);
        }
        C14360o3.A0A(inflate);
        switch (i) {
            case 1:
            case 2:
                return new C5X(inflate, this, i);
            case 3:
                return new C5V(inflate, this);
            case 4:
                return new C5Q(inflate, this);
            case 5:
                return new C5M(inflate, this);
            case 6:
                return new C5U(inflate, this);
            case 7:
                return new C5T(inflate, this);
            case 8:
                Activity activity = this.A00;
                UserSession userSession = this.A03;
                C38321qM c38321qM = this.A05;
                return new C39485HcD(activity, inflate, this.A01, this.A02, userSession, c38321qM, this.A08, false);
            case 9:
                return new C5W(inflate, this.A02, this.A08, this.A0A);
            case 10:
                return new C5O(inflate, this);
            case 11:
                return new C5R(inflate, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C5N(inflate, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C5P(inflate, this);
            default:
                return new C5S(inflate, this);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC25917BdK abstractC25917BdK = (AbstractC25917BdK) c3oo;
        C14360o3.A0B(abstractC25917BdK, 0);
        AbstractC29162CtT abstractC29162CtT = (AbstractC29162CtT) this.A07.get(i);
        abstractC25917BdK.A01(abstractC29162CtT);
        C59072n8 A00 = C59062n7.A00(abstractC29162CtT, Integer.valueOf(i), abstractC29162CtT.getKey());
        A00.A00(this.A06);
        AbstractC25227BEk.A10(abstractC25917BdK.itemView, A00, this.A04);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1738923805);
        int size = this.A07.size();
        C0f9.A0A(612869254, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1733441064);
        List list = this.A07;
        Object obj = list.get(i);
        int i2 = 14;
        if (obj instanceof C26930BuX) {
            i2 = 2;
        } else if (obj instanceof AbstractC26915BuI) {
            i2 = 1;
        } else if (obj instanceof C26928BuV) {
            i2 = 3;
        } else if (obj instanceof C26916BuJ) {
            i2 = 4;
        } else if (obj instanceof C26921BuO) {
            i2 = 5;
        } else if (obj instanceof C26919BuM) {
            i2 = 7;
        } else if (obj instanceof HE0) {
            i2 = 8;
        } else if (obj instanceof C26929BuW) {
            i2 = 9;
        } else if (obj instanceof C26920BuN) {
            i2 = 10;
        } else if (obj instanceof C26924BuR) {
            i2 = 11;
        } else if (obj instanceof C26918BuL) {
            i2 = 12;
        } else if (obj instanceof C26917BuK) {
            i2 = 13;
        } else if (!(obj instanceof C26923BuQ) && !(obj instanceof C26927BuU) && !(obj instanceof C26926BuT) && !(obj instanceof C26922BuP)) {
            if (obj instanceof C26925BuS) {
                i2 = 15;
            } else {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Unknown View Type: ");
                IllegalArgumentException A12 = AbstractC166987dD.A12(AbstractC166997dE.A0v(AbstractC25229BEm.A0r(list.get(i)), A1C));
                C0f9.A0A(1180442327, A03);
                throw A12;
            }
        }
        C0f9.A0A(-334429970, A03);
        return i2;
    }
}
