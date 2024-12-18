package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8DB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DB extends BaseAdapter {
    public boolean A00;
    public boolean A01;
    public final List A02;
    public final int A03 = R.layout.color_palette;
    public final LayoutInflater A04;
    public final UserSession A05;
    public final C8D4 A06;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.A04.inflate(this.A03, viewGroup, false);
        }
        C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette");
        ColorPalette colorPalette = (ColorPalette) view;
        colorPalette.A05 = this.A06;
        UserSession userSession = this.A05;
        List list = this.A02;
        colorPalette.setColorStops(userSession, (ArrayList) list.get(i));
        if (this.A01 && ((AbstractCollection) list.get(i)).size() < 10) {
            z = true;
        }
        colorPalette.A07 = z;
        colorPalette.setIsItemRectangular(this.A00);
        return colorPalette;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A02.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A02.get(i);
    }

    public C8DB(Context context, UserSession userSession, C8D4 c8d4, List list) {
        this.A05 = userSession;
        this.A06 = c8d4;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C8DC.A00((ArrayList) it.next()));
        }
        this.A02 = arrayList;
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        this.A04 = from;
    }
}
