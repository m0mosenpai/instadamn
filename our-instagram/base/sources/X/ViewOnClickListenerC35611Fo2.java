package X;

import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.LinkedHashMap;

/* renamed from: X.Fo2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35611Fo2 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33184EkV A01;
    public final /* synthetic */ FKJ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC35611Fo2(C33184EkV c33184EkV, FKJ fkj, String str, String str2, int i) {
        this.A01 = c33184EkV;
        this.A02 = fkj;
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1290776967);
        C33184EkV c33184EkV = this.A01;
        String str = this.A02.A02;
        int i = this.A00;
        String str2 = this.A03;
        String str3 = this.A04;
        C25531Mh A052 = C25531Mh.A05(AbstractC31172DnG.A0c(c33184EkV.A00).A01);
        if (AbstractC25226BEj.A1Z(A052)) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put(TraceFieldType.ContentType, AbstractC111324zv.A00(724));
            A1I.put("surface", "extra_resource");
            A1I.put("selected_item", "ai_bot_search_plugin_view_sources");
            A1I.put("resource_index", String.valueOf(i + 1));
            if (str2 != null) {
                A1I.put("agent_id", str2);
            }
            if (str3 != null) {
                A1I.put("bot_response_id", str3);
            }
            A052.A0Q("index_id", Long.valueOf(i + 1));
            A052.A0v(A1I);
            A052.Cht();
        }
        SimpleWebViewActivity.A02.A02(c33184EkV.requireContext(), AbstractC166987dD.A0o(c33184EkV.A01), new SimpleWebViewConfig(AbstractC31171DnF.A0R(str)));
        C0f9.A0C(1952200490, A05);
    }
}
