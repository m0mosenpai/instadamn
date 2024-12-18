package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L5U {
    public String A00;
    public final int A01;
    public final DirectThreadThemeInfo A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public L5U(Bundle bundle) {
        Parcelable.Creator creator;
        String string = bundle.getString("message_non_null_identifier", "");
        C14360o3.A07(string);
        this.A09 = string;
        this.A07 = bundle.getString("message_client_context");
        this.A0C = bundle.getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        this.A06 = bundle.getString("media_id");
        String string2 = bundle.getString("message_content", "");
        C14360o3.A07(string2);
        this.A08 = string2;
        String string3 = bundle.getString("message_owner_user_id", "");
        C14360o3.A07(string3);
        this.A0A = string3;
        this.A0G = bundle.getBoolean("should_quote_message_content", true);
        this.A0B = bundle.getString("message_sender_profile_pic_url");
        this.A0H = bundle.getBoolean("should_show_keyboard");
        this.A03 = bundle.getString("channel_creator_id");
        this.A04 = bundle.getString("channel_creator_profile_url");
        this.A0D = bundle.getBoolean("has_channel_ended");
        this.A05 = bundle.getString("channel_disabled_replies_composer");
        this.A0E = bundle.getBoolean("current_user_bc_creator", false);
        this.A0F = bundle.getBoolean("current_user_bc_moderator", false);
        this.A00 = bundle.getString(AbstractC111324zv.A00(137));
        Object obj = DirectThreadThemeInfo.class.getDeclaredField("CREATOR").get(null);
        if ((obj instanceof Parcelable.Creator) && (creator = (Parcelable.Creator) obj) != null) {
            this.A02 = (DirectThreadThemeInfo) ((Parcelable) C0B1.A01(creator, bundle.getParcelable("channel_thread_theme_info"), DirectThreadThemeInfo.class));
            this.A01 = bundle.getInt("channel_thread_replies_count", -1);
        } else {
            Map map = C0YZ.A03;
            throw AbstractC167007dF.A0c("Could not access CREATOR field in class ", AbstractC13230m9.A01(DirectThreadThemeInfo.class));
        }
    }
}
