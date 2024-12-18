package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.KaN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46066KaN extends AnonymousClass522 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C2Y0 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46066KaN(FragmentActivity fragmentActivity, C2Y0 c2y0, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        super(Integer.valueOf(i));
        this.A01 = c2y0;
        this.A09 = str;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A05 = str2;
        this.A0A = z;
        this.A07 = str3;
        this.A08 = str4;
        this.A04 = l;
        this.A06 = str5;
        this.A03 = num;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C2Y0 c2y0 = this.A01;
        if (c2y0 != null) {
            c2y0.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
        }
        String str = this.A09;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        String str2 = this.A05;
        boolean z = this.A0A;
        String str3 = this.A07;
        String str4 = this.A08;
        Long l = this.A04;
        String str5 = this.A06;
        Integer num = this.A03;
        AbstractC25228BEl.A1G(fragmentActivity, AbstractC37303Gc4.A02(userSession, AbstractC31402Dr6.A02(userSession, str, "notes_action_sheet", str2)), userSession, ModalActivity.class, "profile");
        if (z && l != null) {
            String obj = l.toString();
            C14360o3.A0B(obj, 4);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_mention_click_client");
            Long A00 = BSo.A00(userSession, obj);
            if (A0f.isSampled() && A00 != null) {
                A0f.A9K("note_id", A00);
                A0f.A9K("carousel_index", AbstractC25234BEr.A0X(A0f, num, "container_module", str2));
                AbstractC25233BEq.A17(A0f, "carousel_media_id", str5);
                A0f.AAP("inventory_source", str3);
                AbstractC25229BEm.A1B(A0f, str4);
                return;
            }
            return;
        }
        AbstractC135966Db.A01(userSession).A0D(EnumC46303KeZ.A0G);
    }
}
