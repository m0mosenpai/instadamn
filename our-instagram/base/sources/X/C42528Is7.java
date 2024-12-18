package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Is7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42528Is7 implements C3CQ {
    public final /* synthetic */ C38J A00;

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38977HEf c38977HEf = this.A00.A09;
        if (c38977HEf == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return c38977HEf.A04.A0C(c38321qM);
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        Intent intent;
        C14360o3.A0B(c38321qM, 0);
        C38J c38j = this.A00;
        C38977HEf c38977HEf = c38j.A09;
        if (c38977HEf != null) {
            boolean A1b = AbstractC166987dD.A1b(((AbstractC65332xV) c38977HEf.A04).A01);
            C38977HEf c38977HEf2 = c38j.A09;
            if (c38977HEf2 != null) {
                C38977HEf.A00(c38977HEf2);
                C38977HEf c38977HEf3 = c38j.A09;
                if (c38977HEf3 != null) {
                    boolean A1b2 = AbstractC166987dD.A1b(((AbstractC65332xV) c38977HEf3.A04).A01);
                    if (A1b && !A1b2) {
                        if (c38j.A0H) {
                            intent = new Intent();
                            intent.putExtra("media_id", c38321qM.getId());
                            intent.putExtra("media_type", "FEED");
                            if (c38321qM.A2O() == C05F.A01) {
                                intent.putExtra("media_action", AbstractC111324zv.A00(2698));
                                ImageUrl A1S = c38321qM.A1S();
                                if (A1S != null) {
                                    intent.putExtra(AbstractC111324zv.A00(1102), A1S.getUrl());
                                    intent.putExtra(AbstractC111324zv.A00(2708), A1S.getHeight());
                                    intent.putExtra(AbstractC111324zv.A00(2709), A1S.getWidth());
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            } else {
                                intent.putExtra("media_action", AbstractC111324zv.A00(2697));
                            }
                        } else if (c38j.A08 != null) {
                            intent = new Intent();
                            intent.putExtra("media_id", c38321qM.getId());
                            intent.putExtra("media_type", "FEED");
                        }
                        c38j.requireActivity().setResult(-1, intent);
                        AbstractC10360h2 parentFragmentManager = c38j.getParentFragmentManager();
                        FragmentActivity requireActivity = c38j.requireActivity();
                        if (C06P.A01(parentFragmentManager)) {
                            requireActivity.onBackPressed();
                        }
                    }
                    AbstractC10360h2 abstractC10360h2 = c38j.mFragmentManager;
                    if (A1b && !A1b2 && abstractC10360h2 != null && abstractC10360h2.A0L() > 0) {
                        if (c38j.isResumed()) {
                            abstractC10360h2.A0b();
                            return;
                        } else {
                            c38j.A0G = true;
                            return;
                        }
                    }
                    C38977HEf c38977HEf4 = c38j.A09;
                    if (c38977HEf4 != null) {
                        c38977HEf4.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    public C42528Is7(C38J c38j) {
        this.A00 = c38j;
    }
}
