package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66082yk implements InterfaceC66092yl {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C66082yk(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC66092yl
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADw(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81423kC c81423kC) {
        C14360o3.A0B(c81423kC, 0);
        C14360o3.A0B(c4nj, 2);
        AE0(interfaceC55362gb, c4nj, c81423kC, null);
    }

    @Override // X.InterfaceC66092yl
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void AE0(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81423kC c81423kC, Map map) {
        String str;
        ArrayList arrayList;
        ImageUrl imageUrl;
        ImmutableList copyOf;
        C14360o3.A0B(c81423kC, 0);
        C4NM c4nm = c4nj.A08;
        TextView textView = c81423kC.A09;
        String str2 = c4nm.A09.A00;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(STQ.A00(str2, map));
        textView.setVisibility(0);
        C117095Rs c117095Rs = c4nm.A03;
        TextView textView2 = c81423kC.A07;
        if (c117095Rs != null) {
            String str3 = c117095Rs.A00;
            if (str3 == null) {
                str3 = "";
            }
            textView2.setText(STQ.A00(str3, map));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        c81423kC.itemView.setVisibility(0);
        C117135Rw c117135Rw = c4nm.A08;
        if (c117135Rw != null) {
            str = c117135Rw.A00;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView3 = c81423kC.A08;
            textView3.setText(STQ.A00(str, map));
            textView3.setVisibility(0);
        } else {
            c81423kC.A08.setVisibility(8);
        }
        List list = c4nm.A0C;
        if (list != null && (copyOf = ImmutableList.copyOf((Collection) list)) != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(copyOf, 10));
            Iterator<E> it = copyOf.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5Ry) it.next()).A00);
            }
        } else {
            arrayList = null;
        }
        C5Ry c5Ry = c4nm.A06;
        C5Ry c5Ry2 = c4nm.A07;
        if (arrayList != null && !arrayList.isEmpty()) {
            String str4 = c4nj.A0D;
            if (!C14360o3.A0K(str4, c81423kC.A03)) {
                c81423kC.A03 = str4;
                c81423kC.A0B.setImageUris(arrayList, this.A01.getModuleName());
            }
            c81423kC.A0A.setVisibility(8);
            c81423kC.A0B.setVisibility(0);
        } else {
            IgImageView igImageView = c81423kC.A0A;
            if (AbstractC72723Nt.A00(igImageView.getContext()) && c5Ry != null) {
                imageUrl = c5Ry.A00;
            } else if (c5Ry2 != null) {
                imageUrl = c5Ry2.A00;
            } else {
                igImageView.setVisibility(8);
                c81423kC.A0B.setVisibility(8);
            }
            igImageView.setUrl(imageUrl, this.A01);
            igImageView.setVisibility(0);
            c81423kC.A0B.setVisibility(8);
        }
        C4NV c4nv = c4nm.A00;
        ImageView imageView = c81423kC.A06;
        if (c4nv != null) {
            imageView.setVisibility(0);
            C0fQ.A00(new ViewOnClickListenerC55396Oj6(interfaceC55362gb, c4nj, c81423kC), imageView);
        } else {
            imageView.setVisibility(8);
            this.A00 = true;
        }
        TextView textView4 = c81423kC.A01;
        if (textView4 != null) {
            C4NV c4nv2 = c4nm.A01;
            if (c4nv2 != null && c4nv2.A02 != C05F.A0N) {
                String str5 = c4nv2.A00.A00;
                if (str5 == null) {
                    str5 = "";
                }
                String A00 = STQ.A00(str5, map);
                if (A00 != null) {
                    textView4.setVisibility(0);
                    textView4.setText(A00);
                    C0fQ.A00(new Oj7(interfaceC55362gb, c4nj, map), textView4);
                }
            }
            textView4.setVisibility(8);
        }
        TextView textView5 = c81423kC.A02;
        if (textView5 != null) {
            C4NV c4nv3 = c4nm.A02;
            if (c4nv3 != null && c4nv3.A02 != C05F.A0N) {
                String str6 = c4nv3.A00.A00;
                if (str6 == null) {
                    str6 = "";
                }
                String A002 = STQ.A00(str6, map);
                if (A002 != null) {
                    textView5.setText(A002);
                    textView5.setVisibility(0);
                    if (interfaceC55362gb != null) {
                        C0fQ.A00(new ViewOnClickListenerC55411OjM(interfaceC55362gb, c4nj, this, map), textView5);
                        interfaceC55362gb.Dcq(c4nj);
                    }
                    return;
                }
            }
            textView5.setVisibility(8);
        }
        if (interfaceC55362gb == null) {
            return;
        }
        interfaceC55362gb.Dcq(c4nj);
    }

    @Override // X.InterfaceC66092yl
    public final View Csl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.generic_v3_megaphone, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        inflate.setTag(new C81423kC(inflate));
        return inflate;
    }
}
