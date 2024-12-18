package com.instagram.direct.appwidget;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC166987dD;
import X.AbstractC31173DnH;
import X.C0f9;
import X.C14360o3;
import X.C58721Q4x;
import X.C63289Sgo;
import X.C63541Sp9;
import X.C64502TGp;
import X.InterfaceC65291ThO;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class DirectRecipientSearchActivity extends AppCompatActivity implements InterfaceC65291ThO {
    public ListView A00;
    public C58721Q4x A01;
    public String A02;
    public final ArrayList A06 = AbstractC166987dD.A1E();
    public final ArrayList A05 = AbstractC166987dD.A1E();
    public String A03 = "";
    public String A04 = "";

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        C14360o3.A0B(menu, 0);
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem findItem = menu.findItem(R.id.search_bar);
        C14360o3.A07(findItem);
        findItem.setVisible(true);
        View actionView = findItem.getActionView();
        C14360o3.A0C(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setQueryHint(getResources().getString(R.string.res_0x7f1300e6_name_removed));
        searchView.setIconifiedByDefault(false);
        searchView.requestFocus();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.A04 = new C63541Sp9(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String string;
        int A00 = C0f9.A00(1298327125);
        super.onCreate(bundle);
        setContentView(R.layout.direct_recipient_search_fragment);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("current_custom_chat_list");
        if (stringArrayListExtra != null) {
            this.A05.addAll(AbstractC001800i.A0a(stringArrayListExtra));
        }
        Bundle A0A = AbstractC31173DnH.A0A(this);
        String str3 = "";
        if (A0A == null || (str = A0A.getString("current_custom_chat_id")) == null) {
            str = "";
        }
        this.A03 = str;
        if (A0A != null && (string = A0A.getString("selected_user_id")) != null) {
            str3 = string;
        }
        this.A04 = str3;
        if (A0A == null || (str2 = A0A.getString("custom_chat_view_tag")) == null) {
            str2 = "custom_chat_1";
        }
        this.A02 = str2;
        this.A00 = (ListView) findViewById(R.id.recipients);
        if (!AbstractC001900j.A0T(this.A04)) {
            C63289Sgo.A01(new C64502TGp(this, 0), this.A04);
        }
        C0f9.A07(-1040586186, A00);
    }
}
