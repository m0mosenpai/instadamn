package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MTv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50564MTv extends AbstractC146246iN {
    public int A00;
    public List A01 = C16930sl.A00;
    public C8SI A02 = new C8SI();
    public final Context A03;
    public final C50565MTw A04;
    public final String A05;

    public final int A00(C41181vS c41181vS) {
        if (c41181vS != null) {
            Iterator it = this.A01.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (C14360o3.A0K(((C50559MTq) it.next()).A04, c41181vS.A0j)) {
                    if (i != -1) {
                        return i;
                    }
                } else {
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A01.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A01.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.A02.A00(((C50559MTq) this.A01.get(i)).A04);
    }

    @Override // X.AbstractC146246iN, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = AbstractC31172DnG.A0A(LayoutInflater.from(this.A03), null, R.layout.layout_story_viewer_scrubber_item);
            C14360o3.A0A(view);
            view.setTag(new O8W(view));
        }
        C50559MTq c50559MTq = (C50559MTq) this.A01.get(i);
        Object tag = view.getTag();
        if (tag instanceof O8W) {
            ImageUrl imageUrl = (ImageUrl) c50559MTq.A02;
            if (imageUrl != null) {
                ((C44376JjF) ((O8W) tag).A01.getValue()).A02(imageUrl, this.A05);
            }
            MSY.A10(view, this.A00, -1);
            OkD.A00(view, c50559MTq, this, i, 15);
        }
        return view;
    }

    public C50564MTv(Context context, C50565MTw c50565MTw, String str) {
        this.A03 = context;
        this.A05 = str;
        this.A04 = c50565MTw;
    }
}
