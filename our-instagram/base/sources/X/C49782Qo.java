package X;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49782Qo extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49782Qo(Context context, UserSession userSession) {
        super(1696805753, 3, false, true);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C48a c48a;
        ShortcutInfo.Builder intent;
        String string;
        Icon createWithResource;
        BitmapDrawable bitmapDrawable;
        Context context = this.A00;
        UserSession userSession = this.A01;
        Resources resources = context.getResources();
        boolean A00 = AbstractC47372Fk.A00(userSession);
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        ArrayList A1N = AbstractC16960so.A1N(C48a.A07, C48a.A06);
        if (((C17110t6) C0BQ.A00(userSession)).BOc(null).size() != 1) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C1AD.A06(c06090Tz, 18297823401411593L) || C1AD.A06(c06090Tz, 18297823401346056L) || C1AD.A06(c06090Tz, 18297823401477130L)) {
                C48a c48a2 = C48a.A05;
                ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, "account_switch");
                User BWy = C0BQ.A00(userSession).BWy(C17060sy.A01.A01(userSession));
                if (BWy != null && ((((C17110t6) C0BQ.A00(userSession)).BOc(null).size() == 2 && C1AD.A06(C06090Tz.A06, 18297823401477130L)) || C1AD.A06(C06090Tz.A06, 18297823401411593L))) {
                    IgImageView igImageView = new IgImageView(context);
                    igImageView.setUrl(BWy.Bhu(), new C19270xB("app_shortcut"));
                    Drawable drawable = igImageView.getDrawable();
                    if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null && bitmapDrawable.getBitmap() != null) {
                        createWithResource = Icon.createWithAdaptiveBitmap(bitmapDrawable.getBitmap());
                    } else {
                        createWithResource = Icon.createWithResource(context, R.mipmap.account_switch_shortcut_icon);
                    }
                    builder.setIcon(createWithResource);
                    intent = builder.setIntent(AbstractC49772Qn.A00(c48a2, BWy.getId()));
                    string = BWy.getUsername();
                } else {
                    intent = builder.setIcon(Icon.createWithResource(context, R.mipmap.account_switch_shortcut_icon)).setIntent(AbstractC49772Qn.A00(c48a2, null));
                    string = context.getResources().getString(2131952104);
                }
                intent.setShortLabel(string);
                ShortcutInfo build = builder.build();
                C14360o3.A07(build);
                arrayList.add(build);
            }
        }
        if (!AbstractC49772Qn.A01) {
            A1N.add(C48a.A0B);
        }
        if (!AbstractC49772Qn.A00) {
            if (A00) {
                c48a = C48a.A09;
            } else {
                c48a = C48a.A08;
            }
            A1N.add(c48a);
        }
        arrayList.size();
        A1N.size();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        InterfaceC19610xo ARD = C48b.A00(userSession).A00.ARD();
        ARD.EEj("is_eligible_for_maps_shortcut");
        ARD.apply();
        final ShortcutManager shortcutManager2 = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        C06090Tz c06090Tz2 = C06090Tz.A05;
        if (C18U.A06(c06090Tz2, userSession, 36320700176343866L)) {
            AbstractC49772Qn.A01(shortcutManager2);
        } else {
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.48d
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("disablePinnedMapShortcut", 1411403520);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    AbstractC49772Qn.A01(shortcutManager2);
                }
            });
        }
        Iterator it = A1N.iterator();
        while (it.hasNext()) {
            C48a c48a3 = (C48a) it.next();
            ShortcutInfo.Builder builder2 = new ShortcutInfo.Builder(context, c48a3.A02);
            AbstractC916648e abstractC916648e = AbstractC916648e.$redex_init_class;
            switch (c48a3.ordinal()) {
                case 0:
                    i = R.mipmap.camera_shortcut_icon;
                    break;
                case 1:
                    i = R.mipmap.new_post_shortcut_icon;
                    break;
                case 2:
                    i = R.mipmap.activity_shortcut_icon;
                    break;
                case 3:
                    i = R.mipmap.direct_shortcut_icon;
                    break;
                case 4:
                    i = R.mipmap.map_shortcut_icon;
                    break;
                case 5:
                    i = R.mipmap.messenger_shortcut_icon;
                    break;
                default:
                    throw new IllegalArgumentException("unknown shortcut");
            }
            ShortcutInfo.Builder shortLabel = builder2.setIcon(Icon.createWithResource(context, i)).setIntent(c48a3.A01).setShortLabel(resources.getString(c48a3.A00));
            C14360o3.A07(shortLabel);
            ShortcutInfo build2 = shortLabel.build();
            C14360o3.A07(build2);
            arrayList.add(build2);
        }
        try {
            if (C18U.A06(c06090Tz2, userSession, 36331222846162137L)) {
                shortcutManager.addDynamicShortcuts(arrayList);
            } else {
                shortcutManager.setDynamicShortcuts(arrayList);
            }
            arrayList.size();
            shortcutManager.getDynamicShortcuts().size();
        } catch (Exception e) {
            C0w9.A03("ShortcutUtil", AnonymousClass001.A0R("setDynamicShortcuts throw exception: ", e.getMessage()));
        }
    }
}
