package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import java.util.List;

/* renamed from: X.M9b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50089M9b implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C50089M9b(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj4;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        java.util.Set set;
        ExploreTopicCluster exploreTopicCluster;
        Integer num;
        Integer num2;
        switch (this.A00) {
            case 0:
                MN0 mn0 = (MN0) obj;
                if (mn0 instanceof LXB) {
                    AbstractC43592JPx.A1U(this.A01, 0);
                } else if (mn0 instanceof LXA) {
                    AbstractC43592JPx.A1U(this.A01, 8);
                    C9GR.A04(((Fragment) this.A04).getContext());
                } else if (mn0 instanceof C45175JzG) {
                    List list = ((C45175JzG) mn0).A00;
                    boolean isEmpty = list.isEmpty();
                    Object obj2 = this.A01;
                    if (isEmpty) {
                        AbstractC43592JPx.A1U(obj2, 8);
                        View view = (View) this.A03;
                        AbstractC31172DnG.A1J(view, R.id.scheduled_content_empty_state_container, 0);
                        C0fQ.A00(new ViewOnClickListenerC35690FpP(this.A04, 57), AbstractC166997dE.A0S(view, R.id.schedule_content_empty_schedule_post_button));
                    } else {
                        AbstractC43592JPx.A1U(obj2, 8);
                        AbstractC43592JPx.A1U(this.A02, 0);
                        N5J n5j = (N5J) this.A04;
                        C51167MjB c51167MjB = n5j.A00;
                        if (c51167MjB != null) {
                            c51167MjB.A03(list);
                            C51167MjB c51167MjB2 = n5j.A00;
                            if (c51167MjB2 != null) {
                                c51167MjB2.A01();
                            }
                        }
                        C14360o3.A0F("adapter");
                        throw C00O.createAndThrow();
                    }
                } else {
                    throw B4Z.A00();
                }
                return C0eB.A00;
            case 1:
                AbstractC46380Kg2 abstractC46380Kg2 = (AbstractC46380Kg2) obj;
                if (!(abstractC46380Kg2 instanceof KA5)) {
                    if (abstractC46380Kg2 instanceof KA4) {
                        FragmentActivity activity = ((Fragment) this.A02).getActivity();
                        if (activity != null) {
                            LB2.A00(activity, ((KA4) abstractC46380Kg2).A00, (UserSession) this.A04, new C49623LwG(this.A03, 1), "ig_comments");
                        }
                    } else {
                        throw B4Z.A00();
                    }
                }
                ((C143266dR) this.A01).A01();
                return C0eB.A00;
            case 2:
                if (!(obj instanceof MUq)) {
                    if (MU9.A01(obj, 0)) {
                        NidoExploreViewModel nidoExploreViewModel = (NidoExploreViewModel) this.A04;
                        exploreTopicCluster = (ExploreTopicCluster) this.A02;
                        AbstractC42425IqS abstractC42425IqS = (AbstractC42425IqS) this.A01;
                        Integer num3 = (Integer) this.A03;
                        int intValue = num3.intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                num = C05F.A0N;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            num = C05F.A01;
                        }
                        NidoExploreViewModel.A01(exploreTopicCluster, nidoExploreViewModel, num, num3);
                        abstractC42425IqS.A0B();
                        set = nidoExploreViewModel.A02;
                    } else if (MU9.A01(obj, 1)) {
                        set = ((NidoExploreViewModel) this.A04).A02;
                        exploreTopicCluster = (ExploreTopicCluster) this.A02;
                    } else {
                        throw B4Z.A00();
                    }
                    set.remove(exploreTopicCluster.A06);
                }
                return C0eB.A00;
            default:
                if (!(obj instanceof MUq) && !MU9.A01(obj, 1)) {
                    if (MU9.A01(obj, 0)) {
                        NidoExploreViewModel nidoExploreViewModel2 = (NidoExploreViewModel) this.A04;
                        ExploreTopicCluster exploreTopicCluster2 = (ExploreTopicCluster) this.A02;
                        AbstractC42425IqS abstractC42425IqS2 = (AbstractC42425IqS) this.A01;
                        Integer num4 = (Integer) this.A03;
                        int intValue2 = num4.intValue();
                        if (intValue2 != 0) {
                            if (intValue2 == 1) {
                                num2 = C05F.A0Y;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            num2 = C05F.A00;
                        }
                        NidoExploreViewModel.A01(exploreTopicCluster2, nidoExploreViewModel2, num2, num4);
                        abstractC42425IqS2.A0B();
                    } else {
                        throw B4Z.A00();
                    }
                }
                return C0eB.A00;
        }
    }
}
