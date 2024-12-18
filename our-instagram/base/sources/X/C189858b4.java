package X;

import android.content.Context;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.8b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189858b4 {
    public static final ArrayList A02;
    public int A00;
    public final ArrayList A01;

    public C189858b4(final Context context) {
        C14360o3.A0B(context, 1);
        this.A01 = new ArrayList<Integer>(context) { // from class: X.8b5
            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (!(obj instanceof Integer)) {
                    return false;
                }
                return super.contains(obj);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                return super.indexOf(obj);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                return super.lastIndexOf(obj);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean remove(Object obj) {
                if (obj != null && !(obj instanceof Integer)) {
                    return false;
                }
                return super.remove(obj);
            }

            {
                addAll(AbstractC16960so.A1Q(Integer.valueOf(context.getColor(R.color.design_dark_default_color_on_background)), Integer.valueOf(context.getColor(R.color.black)), Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink))), Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_purple))), Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange))), Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green))), Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue))), -1711276033));
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ int size() {
                return super.size();
            }
        };
    }

    static {
        ArrayList arrayList = C8DA.A00;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(1, arrayList.size()));
        arrayList2.add(-1711276033);
        arrayList2.add(-1728053248);
        A02 = arrayList2;
    }
}
