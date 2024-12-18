package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Jnn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44566Jnn extends C2UU {
    public int A00;
    public int A01;
    public final Fragment A02;
    public final UserSession A03;
    public final ArrayList A04;
    public final ArrayList A05;
    public final ArrayList A06;

    public C44566Jnn(Fragment fragment, UserSession userSession, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        C14360o3.A0B(userSession, 4);
        this.A04 = arrayList;
        this.A05 = arrayList2;
        this.A06 = arrayList3;
        this.A03 = userSession;
        this.A02 = fragment;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        android.net.Uri uri;
        ArrayList arrayList;
        Object A0i;
        C19K A02;
        int i2;
        C44716Jqz c44716Jqz = (C44716Jqz) c3oo;
        C14360o3.A0B(c44716Jqz, 0);
        ArrayList arrayList2 = this.A04;
        if (arrayList2 != null && (uri = (android.net.Uri) arrayList2.get(i)) != null) {
            String type = this.A02.requireContext().getContentResolver().getType(uri);
            if (type != null) {
                if (AbstractC43592JPx.A1a("image", 1, type)) {
                    ArrayList arrayList3 = this.A05;
                    if (arrayList3 != null) {
                        A0i = AbstractC31173DnH.A0i(arrayList3, this.A00);
                        this.A00++;
                        A02 = AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00));
                        i2 = 14;
                        AbstractC166987dD.A1Z(new C50119MBt(c44716Jqz, A0i, this, null, i2), A02);
                    }
                } else if (AbstractC43592JPx.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, type) && (arrayList = this.A06) != null) {
                    A0i = AbstractC31173DnH.A0i(arrayList, this.A01);
                    this.A01++;
                    A02 = AnonymousClass194.A02(C12L.A00.A04);
                    i2 = 15;
                    AbstractC166987dD.A1Z(new C50119MBt(c44716Jqz, A0i, this, null, i2), A02);
                }
            }
            if (arrayList2.size() > 4 && i == 3) {
                TextView textView = c44716Jqz.A00;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText(AnonymousClass001.A00('+', arrayList2.size() - 4));
                }
                RoundedCornerImageView roundedCornerImageView = c44716Jqz.A03;
                if (roundedCornerImageView != null) {
                    roundedCornerImageView.setVisibility(0);
                }
            }
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int itemCount = getItemCount();
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        int i2 = R.layout.direct_private_share_write_message_thumbnail_small_media_item;
        if (itemCount == 1) {
            i2 = R.layout.direct_private_share_write_message_thumbnail_media_item;
        }
        return new C44716Jqz(A0P.inflate(i2, viewGroup, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(-576717249);
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        int min = Math.min(i, 4);
        C0f9.A0A(-838574144, A03);
        return min;
    }
}
