package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class CCD {
    /* JADX WARN: Multi-variable type inference failed */
    public static final JSONObject A00(AbstractC28368CfU abstractC28368CfU) {
        Object tag;
        String str;
        int id;
        Integer valueOf;
        View view;
        C14360o3.A0B(abstractC28368CfU, 0);
        JSONObject jSONObject = new JSONObject();
        Object obj = abstractC28368CfU.A02;
        boolean z = obj instanceof View;
        Object obj2 = null;
        if (z && (view = (View) obj) != null) {
            obj2 = view.getTag(R.id.view_tag_native_id);
        }
        jSONObject.put("node_class", abstractC28368CfU.getClass().getCanonicalName());
        if (obj2 == null) {
            obj2 = obj.getClass().getCanonicalName();
        }
        jSONObject.put("class", obj2);
        View view2 = (View) obj;
        Object tag2 = view2.getTag(R.id.bk_extension_viewtag_int);
        if ((tag2 instanceof Integer) && tag2 != null) {
            tag = AbstractC167017dG.A0n(tag2, "bk:", AbstractC166987dD.A1C());
        } else {
            tag = view2.getTag(R.id.fbui_ui_tracker_view_simple_name);
        }
        if (tag != null) {
            jSONObject.put("simple_name", tag);
        }
        if (z && (valueOf = Integer.valueOf((id = view2.getId()))) != null && id != -1) {
            String format = String.format(Locale.US, "0x%08x", AbstractC166997dE.A1b(valueOf, 1));
            C14360o3.A07(format);
            jSONObject.put("view_id", format);
        }
        if (1 - abstractC28368CfU.A01.intValue() != 0) {
            str = "VIEW";
        } else {
            str = "LITHO";
        }
        jSONObject.put(AbstractC111324zv.A00(3262), str);
        if (abstractC28368CfU instanceof InterfaceC31102Dlk) {
            C51758Mth BMs = ((InterfaceC31102Dlk) abstractC28368CfU).BMs();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_visible", BMs.A01);
            jSONObject2.put("bounds_on_screen", ((Rect) BMs.A00).flattenToString());
            jSONObject.put("leaf_data", jSONObject2);
        }
        List list = abstractC28368CfU.A03;
        if (AbstractC166987dD.A1b(list)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(A00((AbstractC28368CfU) it.next()));
            }
            jSONObject.put("children", jSONArray);
        }
        return jSONObject;
    }
}
