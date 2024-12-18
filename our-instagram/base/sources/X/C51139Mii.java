package X;

import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @ReplaceWith(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
/* renamed from: X.Mii, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51139Mii extends C2UU {
    public final Context A00;
    public final OUW A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC16620sF A04;

    public C51139Mii(Context context, AbstractC65412xd abstractC65412xd, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C30193DRy c30193DRy = new C30193DRy(this, 17);
        this.A04 = c30193DRy;
        OUW ouw = new OUW(abstractC65412xd, this);
        this.A01 = ouw;
        ouw.A09.add(new C55576OmE(c30193DRy));
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A00 = context;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C51325Mlm c51325Mlm = new C51325Mlm(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_clips_grid_item, false), this);
        Size A01 = AbstractC153796vo.A01(this.A00, 0.5625f);
        AbstractC13880nE.A0g(AbstractC31171DnF.A06(c51325Mlm), A01.getWidth());
        AbstractC13880nE.A0W(AbstractC31171DnF.A06(c51325Mlm), A01.getHeight());
        return c51325Mlm;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        Object obj;
        ImageUrl A1S;
        C51325Mlm c51325Mlm = (C51325Mlm) c3oo;
        C14360o3.A0B(c51325Mlm, 0);
        OUW ouw = this.A01;
        PW7 pw7 = ouw.A02;
        PW7 pw72 = ouw.A01;
        if (pw7 != null) {
            obj = pw7.get(i);
        } else if (pw72 != null) {
            pw72.A01(i);
            obj = pw72.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        C120985dq c120985dq = (C120985dq) obj;
        if (c120985dq != null) {
            IgImageButton igImageButton = c51325Mlm.A02;
            ((ConstrainedImageView) igImageButton).A00 = 0.5625f;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (A1S = c38321qM.A1S()) != null) {
                igImageButton.setUrl(A1S, c51325Mlm.A03.A02);
            }
            igImageButton.setContentDescription(AbstractC166997dE.A0r(c51325Mlm.itemView.getResources(), c120985dq.A09(c51325Mlm.A03.A03), 2131972097));
            c51325Mlm.A01.setText(AbstractC43744JWe.A01(c51325Mlm.itemView.getResources(), Integer.valueOf(c120985dq.A0C), false));
            c51325Mlm.A00.setVisibility(0);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(1087864108);
        OUW ouw = this.A01;
        PW7 pw7 = ouw.A02;
        if (pw7 == null && (pw7 = ouw.A01) == null) {
            size = 0;
        } else {
            size = pw7.size();
        }
        C0f9.A0A(231148461, A03);
        return size;
    }
}
