package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JkA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44415JkA extends BaseAdapter {
    public L6X A00;
    public final UserSession A01;
    public final LLR A02;
    public final List A03;
    public final Context A04;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        IgSimpleImageView igSimpleImageView;
        View.OnClickListener lOx;
        String str;
        C14360o3.A0B(viewGroup, 2);
        IgSimpleImageView igSimpleImageView2 = null;
        if (view instanceof IgSimpleImageView) {
            igSimpleImageView = (IgSimpleImageView) view;
        } else {
            igSimpleImageView = null;
        }
        Context context = this.A04;
        LayoutInflater from = LayoutInflater.from(context);
        if (igSimpleImageView == null) {
            View A0A = AbstractC31172DnG.A0A(from, viewGroup, R.layout.quick_note_emoji);
            if (A0A instanceof IgSimpleImageView) {
                igSimpleImageView2 = (IgSimpleImageView) A0A;
            }
            igSimpleImageView = igSimpleImageView2;
        }
        if (i == 0) {
            if (igSimpleImageView != null) {
                AbstractC44198Jg1.A08(igSimpleImageView, R.drawable.instagram_add_pano_outline_24);
                lOx = ViewOnClickListenerC48074LPz.A00(this, 62);
                C0fQ.A00(lOx, igSimpleImageView);
            }
        } else if (i <= 5) {
            int A03 = AbstractC167017dG.A03(context);
            C6RB c6rb = new C6RB(context, A03);
            String str2 = (String) AbstractC001800i.A0O(this.A03, i);
            if (str2 == null || (str = AbstractC25228BEl.A1A(str2)) == null) {
                str = "";
            }
            c6rb.A0M(str);
            c6rb.A0A(A03);
            if (igSimpleImageView != null) {
                igSimpleImageView.setImageDrawable(new C44350Jip(AbstractC166997dE.A0L(igSimpleImageView), c6rb));
                lOx = new LOx(this, i, 4);
                C0fQ.A00(lOx, igSimpleImageView);
            }
        } else if (igSimpleImageView != null) {
            AbstractC44198Jg1.A08(igSimpleImageView, R.drawable.instagram_reaction_add_pano_outline_24);
            lOx = new LOx(this, i, 5);
            C0fQ.A00(lOx, igSimpleImageView);
        }
        return igSimpleImageView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A03.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        Object A0O = AbstractC001800i.A0O(this.A03, i);
        if (A0O == null) {
            return "";
        }
        return A0O;
    }

    public C44415JkA(Context context, UserSession userSession, LLR llr) {
        AbstractC167017dG.A1R(userSession, llr);
        this.A04 = context;
        this.A01 = userSession;
        this.A02 = llr;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        List A04 = C23031Ai.A04(AbstractC23021Ah.A00(userSession), "friend_map_recent_emoji_list");
        A04 = A04.isEmpty() ? AbstractC166987dD.A1E() : A04;
        if (A04.isEmpty()) {
            A1E.addAll(AbstractC16960so.A1Q("📍", "👀", "🔥", "🎉", "😴"));
            C23031Ai.A06(AbstractC23021Ah.A00(userSession), "friend_map_recent_emoji_list", A1E);
            A1E.add(0, "placeHolderCreateNote");
        } else {
            A1E.add("placeHolderCreateNote");
            A1E.addAll(A04);
        }
        A1E.add("placeHolderCustomEmoji");
    }
}
