package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class V3H extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC58311Pt3 A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C26030BfJ A05;
    public final C31251DoZ A06;
    public final HashSet A07 = new HashSet();
    public final C68832Vcn A04 = new C68832Vcn(this);

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 16;
    }

    public static View A00(ViewGroup viewGroup, V3H v3h) {
        return LayoutInflater.from(v3h.A00).inflate(R.layout.profile_dense_multi_row_media, viewGroup, false);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i;
        F9F f9f = F9F.$redex_init_class;
        switch (((C5HW) obj).A05.ordinal()) {
            case 0:
            case 10:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 13;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 11:
                i = 9;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 10;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 11;
                break;
            case 14:
                i = 12;
                break;
            case Process.SIGTERM /* 15 */:
                i = 14;
                break;
            case 16:
                i = 15;
                break;
            default:
                throw new IndexOutOfBoundsException("Unsupported item view type");
        }
        anonymousClass306.A7a(i);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return AbstractC31177DnL.A04(((C5HW) obj).A09);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        int hashCode;
        FollowStatus followStatus;
        int hashCode2;
        int hashCode3;
        C5HX c5hx;
        ImageUrl imageUrl;
        C5HW c5hw = (C5HW) obj;
        if (i != 0) {
            if (i != 2) {
                if (i == 4 && (imageUrl = (c5hx = c5hw.A04).A0E) != null) {
                    hashCode2 = imageUrl.getUrl().hashCode();
                    hashCode3 = AbstractC167017dG.A0K(c5hx.A05);
                    hashCode = hashCode2 * hashCode3;
                }
                hashCode = Integer.MAX_VALUE;
            } else {
                UserSession userSession = this.A03;
                User A04 = c5hw.A04();
                if (A04 != null) {
                    followStatus = C57582kX.A00(userSession).A0N(A04);
                } else {
                    followStatus = null;
                }
                ImageUrl imageUrl2 = c5hw.A04.A0E;
                if (imageUrl2 != null && followStatus != null) {
                    hashCode2 = imageUrl2.getUrl().hashCode();
                    hashCode3 = followStatus.hashCode();
                    hashCode = hashCode2 * hashCode3;
                }
                hashCode = Integer.MAX_VALUE;
            }
        } else {
            String str = c5hw.A04.A06;
            if (str != null) {
                hashCode = str.hashCode();
            }
            hashCode = Integer.MAX_VALUE;
        }
        String str2 = c5hw.A04.A0o;
        if (hashCode == Integer.MAX_VALUE && str2 != null) {
            return str2.hashCode();
        }
        return hashCode;
    }

    public V3H(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58311Pt3 interfaceC58311Pt3, C31251DoZ c31251DoZ) {
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = interfaceC58311Pt3;
        this.A06 = c31251DoZ;
        this.A05 = new C26030BfJ(new C57245PbT(userSession, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.WlT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.VJc, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        View view;
        int A03 = C0f9.A03(1853345349);
        switch (i) {
            case 0:
            case Process.SIGTERM /* 15 */:
                View A00 = A00(viewGroup, this);
                A00.setTag(new WlY(A00));
                i2 = 2002873289;
                view = A00;
                break;
            case 1:
                View A002 = A00(viewGroup, this);
                A002.setTag(new C69424Vn9(A002));
                i2 = 259522733;
                view = A002;
                break;
            case 2:
                View A003 = A00(viewGroup, this);
                A003.setTag(new WlU(A003));
                i2 = 767813658;
                view = A003;
                break;
            case 3:
                View A004 = A00(viewGroup, this);
                A004.setTag(new WlV(A004));
                i2 = 1435402158;
                view = A004;
                break;
            case 4:
                View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_group_follow_request);
                A0A.setTag(new FMV(A0A));
                i2 = 1338263049;
                view = A0A;
                break;
            case 5:
                View A0A2 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_single_media);
                A0A2.setTag(new C69242VkA(A0A2));
                i2 = 830771668;
                view = A0A2;
                break;
            case 6:
                View A0A3 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_copyright_video_removed);
                A0A3.setTag(new C69241Vk9(A0A3));
                i2 = 1356274521;
                view = A0A3;
                break;
            case 7:
                View A0A4 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_copyright_video_reinstated);
                A0A4.setTag(new C69240Vk8(A0A4));
                i2 = 864059113;
                view = A0A4;
                break;
            case 8:
                View A0A5 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_campaign_message);
                A0A5.setTag(new C69394Vme(A0A5));
                i2 = 20557044;
                view = A0A5;
                break;
            case 9:
                View A0A6 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_insights_entry);
                A0A6.setTag(new C69243VkB(A0A6));
                i2 = -1657054813;
                view = A0A6;
                break;
            case 10:
                View A0A7 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_canvas_preview);
                A0A7.setTag(new C69024Vg0(A0A7));
                i2 = 1764012587;
                view = A0A7;
                break;
            case 11:
                View A005 = A00(viewGroup, this);
                A005.setTag(new WlW(A005));
                i2 = 154328206;
                view = A005;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                View A0A8 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.bundled_notification);
                ?? obj = new Object();
                obj.A00 = A0A8;
                obj.A02 = (CircularImageView) A0A8.requireViewById(R.id.bundled_notification_imageview);
                obj.A03 = (StackedAvatarView) A0A8.requireViewById(R.id.bundled_notification_stacked_avatar);
                obj.A01 = (TextView) A0A8.requireViewById(R.id.bundled_notification_row_text);
                A0A8.setTag(obj);
                i2 = 1166479922;
                view = A0A8;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                View A006 = A00(viewGroup, this);
                A006.setTag(new WlX(A006));
                i2 = 1224353313;
                view = A006;
                break;
            case 14:
                View A0A9 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_icon_with_inline_button_view);
                ?? obj2 = new Object();
                obj2.A00 = A0A9;
                obj2.A03 = (CircularImageView) A0A9.requireViewById(R.id.inline_button_notification_imageview);
                obj2.A01 = (TextView) A0A9.requireViewById(R.id.inline_button_notification_text);
                obj2.A02 = (TextView) A0A9.requireViewById(R.id.inline_button_notification_button);
                A0A9.setTag(obj2);
                i2 = 2103079219;
                view = A0A9;
                break;
            default:
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Unhandled view type");
                C0f9.A0A(-236688289, A03);
                throw indexOutOfBoundsException;
        }
        C0f9.A0A(i2, A03);
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0695, code lost:
    
        if (r5 == 150) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0ab5, code lost:
    
        if (r4 != null) goto L264;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0025. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a0  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r35, android.view.View r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 3402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V3H.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }
}
