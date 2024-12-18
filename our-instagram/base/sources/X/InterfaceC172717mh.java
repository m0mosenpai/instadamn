package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.7mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC172717mh {
    void AIE(int i, String str);

    void AIO(int i, String str);

    String B59(String str);

    QF6 C9a();

    void Ckl(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy);

    boolean DJx(boolean z);

    void Eg2(int i);

    void FD0(VD2 vd2, Integer num);

    FragmentActivity getActivity();

    AbstractC10360h2 getChildFragmentManager();

    Intent getIntent();

    AbstractC10360h2 getParentFragmentManager();
}
