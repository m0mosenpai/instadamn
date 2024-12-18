package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210619Ta extends BaseAdapter {
    public final Context A00;
    public final TargetViewSizeProvider A01;
    public final WP8 A02;
    public final UserSession A03;
    public final List A04;

    public C210619Ta(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, WP8 wp8) {
        C14360o3.A0B(context, 2);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = targetViewSizeProvider;
        this.A02 = wp8;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A04 = A1E;
        A1E.add(AbstractC16960so.A1Q("😍", "😂", "😀", "🔥", "😡", "😱", "😢", "🙌️"));
        A1E.add(AbstractC16960so.A1Q("❤️", "🎉", "👍", "💩", "💯", "🙏", "😮", "😴"));
        A1E.add(AbstractC16960so.A1Q("😭", "😒", "😎", "😲", "😩", "😐", "😇", "😷"));
        A1E.add(AbstractC16960so.A1Q("👏", "👀", "🐶", "🐱", "🐷", "🙈", "🙉", "🙊"));
        A1E.add(AbstractC16960so.A1Q("💔", "🌝", "🌚", "🌞", "👑", "🌈", "💰", "👻"));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        C14360o3.A0B(viewGroup, 2);
        Context context = this.A00;
        LayoutInflater from = LayoutInflater.from(context);
        if (view == null) {
            view = from.inflate(R.layout.emoji_palette_parent, viewGroup, false);
        }
        C14360o3.A0A(from);
        ViewGroup viewGroup2 = (ViewGroup) view;
        if (viewGroup2 != null) {
            List list = (List) this.A04.get(i);
            while (true) {
                if (viewGroup2.getChildCount() >= list.size()) {
                    break;
                }
                View inflate = from.inflate(R.layout.emoji_palette_child, viewGroup2, false);
                C14360o3.A0A(inflate);
                AbstractC13880nE.A0g(inflate, (InterfaceC1812882f.A00(this.A01) - (AbstractC167017dG.A03(context) * 2)) / list.size());
                viewGroup2.addView(inflate);
            }
            while (viewGroup2.getChildCount() > list.size()) {
                viewGroup2.removeViewAt(0);
            }
            int size = list.size();
            for (i2 = 0; i2 < size; i2++) {
                String str = (String) list.get(i2);
                View childAt = viewGroup2.getChildAt(i2);
                C14360o3.A0C(childAt, AbstractC111324zv.A00(21));
                ImageView imageView = (ImageView) childAt;
                int A00 = InterfaceC1812882f.A00(this.A01);
                AbstractC167017dG.A1N(context, str);
                int A04 = AbstractC166997dE.A04(context, R.dimen.album_preview_add_item_margin);
                C6RB A0z = AbstractC166987dD.A0z(context, A00);
                A0z.A0M(str);
                A0z.A0A(A04);
                imageView.setImageDrawable(A0z);
                C0fQ.A00(new AS2(str, this, 2), imageView);
            }
            return viewGroup2;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A04.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A04.get(i);
    }
}
