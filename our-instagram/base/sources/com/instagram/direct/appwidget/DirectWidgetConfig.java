package com.instagram.direct.appwidget;

import X.AbstractC001900j;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC51982Zy;
import X.AbstractC53242c7;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C00O;
import X.C00Q;
import X.C08730cb;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C17060sy;
import X.C63289Sgo;
import X.C64503TGq;
import X.C64504TGs;
import X.MSW;
import X.Q5b;
import X.ViewOnClickListenerC63504SoX;
import X.ViewOnClickListenerC63507Soa;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.R;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class DirectWidgetConfig extends AppCompatActivity {
    public int A00;
    public TextView A01;
    public Q5b A02;
    public String A03;
    public String A04;
    public final HashMap A05 = AbstractC166987dD.A1G();

    public final void launchCustomChatSearch(View view) {
        String str;
        C14360o3.A0B(view, 0);
        Intent A08 = MSW.A08(this, DirectRecipientSearchActivity.class);
        View findViewById = findViewById(R.id.custom_chats_list);
        C14360o3.A07(findViewById);
        Bundle A0b = AbstractC166987dD.A0b();
        Object tag = view.getTag();
        if (tag != null) {
            A0b.putString("custom_chat_view_tag", tag.toString());
            View findViewWithTag = findViewById.findViewWithTag(tag);
            C14360o3.A0C(findViewWithTag, AbstractC111324zv.A00(3));
            str = ((TextView) findViewWithTag).getText().toString();
        } else {
            str = null;
        }
        A0b.putString("selected_user_id", this.A03);
        C63289Sgo.A01(new C64504TGs(A08, A0b, this, str), this.A03);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        bundle.putString("config_account_username", this.A04);
        bundle.putString("config_account_user_id", this.A03);
        String A0B = new Gson().A0B(this.A05);
        C14360o3.A07(A0B);
        bundle.putString("config_chats_list", A0B);
        super.onSaveInstanceState(bundle);
    }

    public static final void A00(DirectWidgetConfig directWidgetConfig) {
        directWidgetConfig.A05.clear();
        A01(directWidgetConfig);
        View findViewById = directWidgetConfig.findViewById(R.id.chat_type);
        C14360o3.A07(findViewById);
        ((TextView) findViewById).setText(R.string.res_0x7f1300a2_name_removed);
        View findViewById2 = directWidgetConfig.findViewById(R.id.custom_chats_list);
        C14360o3.A07(findViewById2);
        findViewById2.setVisibility(8);
    }

    public static final void A01(DirectWidgetConfig directWidgetConfig) {
        View findViewById = directWidgetConfig.findViewById(R.id.custom_chats_list);
        C14360o3.A07(findViewById);
        for (int i = 1; i < 5; i++) {
            TextView textView = (TextView) findViewById.findViewWithTag(AnonymousClass001.A0O("custom_chat_", i));
            if (textView != null) {
                textView.setText(R.string.res_0x7f1300e8_name_removed);
            }
        }
        Iterator A14 = AbstractC166997dE.A14(directWidgetConfig.A05);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            int A0H = AbstractC166987dD.A0H(A1K.getKey());
            DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) A1K.getValue();
            TextView textView2 = (TextView) findViewById.findViewWithTag(AnonymousClass001.A0O("custom_chat_", A0H + 1));
            if (textView2 != null) {
                textView2.setText(directThreadWidgetItem.A05);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        String string;
        Bundle extras2;
        DirectThreadWidgetItem directThreadWidgetItem;
        Object obj;
        Object key;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("custom_chat_view_tag")) != null && (extras2 = intent.getExtras()) != null && (directThreadWidgetItem = (DirectThreadWidgetItem) extras2.getParcelable("direct_widget_custom_chat_info")) != null) {
                View findViewById = findViewById(R.id.custom_chats_list);
                C14360o3.A07(findViewById);
                HashMap hashMap = this.A05;
                Set entrySet = hashMap.entrySet();
                C14360o3.A07(entrySet);
                Iterator it = entrySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (C14360o3.A0K(((DirectThreadWidgetItem) ((Map.Entry) obj).getValue()).A05, directThreadWidgetItem.A05)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null && (key = entry.getKey()) != null) {
                    hashMap.remove(key);
                    TextView textView = (TextView) findViewById.findViewWithTag(string);
                    if (textView != null) {
                        textView.setText(textView.getResources().getString(R.string.res_0x7f1300e8_name_removed));
                    }
                    if (hashMap.isEmpty()) {
                        findViewById.setVisibility(8);
                    }
                } else {
                    findViewById.setVisibility(0);
                    AbstractC58319PtB.A1H(directThreadWidgetItem, hashMap, Integer.parseInt(String.valueOf(C00Q.A00(string))) - 1);
                    TextView textView2 = (TextView) findViewById.findViewWithTag(string);
                    if (textView2 != null) {
                        textView2.setText(directThreadWidgetItem.A05);
                    }
                }
                View findViewById2 = findViewById(R.id.chat_type);
                C14360o3.A0C(findViewById2, AbstractC111324zv.A00(3));
                TextView textView3 = (TextView) findViewById2;
                boolean isEmpty = hashMap.isEmpty();
                int i3 = R.string.res_0x7f130032_name_removed;
                if (isEmpty) {
                    i3 = R.string.res_0x7f1300a2_name_removed;
                }
                textView3.setText(i3);
            } else {
                return;
            }
        }
        Q5b q5b = this.A02;
        if (q5b == null) {
            C14360o3.A0F("bottomSheet");
            throw C00O.createAndThrow();
        }
        q5b.dismiss();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        int A00 = C0f9.A00(-992364203);
        super.onCreate(bundle);
        setContentView(R.layout.direct_app_widget_config);
        Q5b q5b = new Q5b(this, 0);
        q5b.A07 = q5b.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        this.A02 = q5b;
        boolean z = false;
        if (bundle != null) {
            z = true;
            String string = bundle.getString("config_account_user_id");
            if (string != null) {
                this.A03 = string;
            }
            String string2 = bundle.getString("config_account_username");
            if (string2 != null) {
                this.A04 = string2;
            }
        }
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            this.A00 = A0A.getInt("appWidgetId", 0);
            View findViewById = findViewById(R.id.widget_settings_header);
            C14360o3.A07(findViewById);
            ImageView A08 = AbstractC31171DnF.A08(findViewById, R.id.exit_icon);
            if (A08 != null) {
                Context context = A08.getContext();
                A08.setColorFilter(context.getColor(AbstractC53242c7.A08(context)), PorterDuff.Mode.SRC_ATOP);
                ViewOnClickListenerC63507Soa.A00(A08, 1, this);
            }
            View findViewById2 = findViewById(R.id.username);
            C14360o3.A07(findViewById2);
            TextView textView = (TextView) findViewById2;
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (A0F instanceof UserSession) {
                Context baseContext = getBaseContext();
                C14360o3.A07(baseContext);
                SharedPreferences A0G = AbstractC58322PtE.A0G(baseContext, this.A00);
                String string3 = A0G.getString(AnonymousClass001.A0O("com.instagram.direct.appwidget.USER", this.A00), null);
                String string4 = A0G.getString(AnonymousClass001.A0O("com.instagram.direct.appwidget.USER_ID", this.A00), null);
                if (!z) {
                    if (string4 != null && !AbstractC001900j.A0T(string4)) {
                        this.A03 = string4;
                    } else {
                        A00(this);
                        C08730cb c08730cb = C17060sy.A01;
                        UserSession userSession = (UserSession) A0F;
                        this.A03 = c08730cb.A01(userSession).getId();
                        string3 = c08730cb.A01(userSession).getUsername();
                    }
                    this.A04 = string3;
                }
                textView.setText(this.A04);
                C0fQ.A00(new ViewOnClickListenerC63504SoX(6, A0F, textView, this), textView);
            }
            if (bundle != null) {
                str = bundle.getString("config_chats_list");
            } else {
                str = null;
            }
            View findViewById3 = findViewById(R.id.chat_type);
            C14360o3.A07(findViewById3);
            TextView textView2 = (TextView) findViewById3;
            if (this.A04 == null) {
                AbstractC166987dD.A1O(this, textView2, R.color.grey_5);
            } else {
                AbstractC166987dD.A1O(this, textView2, R.color.badge_color);
                C63289Sgo.A01(new C64503TGq(this, str), this.A03);
                View findViewById4 = findViewById(R.id.custom_chats_list);
                C14360o3.A07(findViewById4);
                HashMap hashMap = this.A05;
                if (!hashMap.isEmpty()) {
                    findViewById4.setVisibility(0);
                }
                boolean isEmpty = hashMap.isEmpty();
                int i2 = R.string.res_0x7f130032_name_removed;
                if (isEmpty) {
                    i2 = R.string.res_0x7f1300a2_name_removed;
                }
                textView2.setText(i2);
                C0fQ.A00(new ViewOnClickListenerC63504SoX(8, findViewById4, textView2, this), textView2);
            }
            TextView textView3 = (TextView) findViewById(R.id.theme_type);
            this.A01 = textView3;
            if (textView3 != null) {
                int i3 = AbstractC51982Zy.A00;
                if (i3 != 1) {
                    i = R.string.res_0x7f1300eb_name_removed;
                    if (i3 != 2) {
                        i = R.string.res_0x7f1300ec_name_removed;
                    }
                } else {
                    i = R.string.res_0x7f1300ed_name_removed;
                }
                textView3.setText(i);
                String str2 = this.A04;
                TextView textView4 = this.A01;
                if (str2 == null) {
                    if (textView4 != null) {
                        AbstractC166987dD.A1O(this, textView4, R.color.grey_5);
                    }
                } else if (textView4 != null) {
                    AbstractC166987dD.A1O(this, textView4, R.color.badge_color);
                    TextView textView5 = this.A01;
                    if (textView5 != null) {
                        ViewOnClickListenerC63507Soa.A00(textView5, 8, this);
                    }
                }
            }
            C14360o3.A0F("widgetThemeButton");
            throw C00O.createAndThrow();
        }
        Intent A04 = AbstractC31171DnF.A04();
        A04.putExtra("appWidgetId", this.A00);
        setResult(0, A04);
        if (this.A00 == 0) {
            finish();
        }
        C0f9.A07(1876568807, A00);
    }
}
