package com.instagram.debug.devoptions.search.bootstrap;

import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC81033jX;
import X.C0f9;
import X.C0fQ;
import X.C127165ou;
import X.C2UU;
import X.C3OO;
import X.InterfaceC11380iw;
import X.MSX;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class BootstrapUsersAdapter extends C2UU {
    public final InterfaceC11380iw mAnalyticsModule;
    public final Delegate mDelegate;
    public final C127165ou mSurface;
    public final List mUnfilteredUsers = new ArrayList();
    public final List mFilteredUsers = new ArrayList();

    /* loaded from: classes11.dex */
    public interface Delegate {
        void onUserClick(BootstrapUserInfo bootstrapUserInfo);

        void onUserLongClick(BootstrapUserInfo bootstrapUserInfo);
    }

    /* loaded from: classes11.dex */
    public class UserInfoViewHolder extends C3OO {
        public final CircularImageView mAvatarView;
        public final TextView mOtherScoresView;
        public final TextView mRankView;
        public final TextView mScoreView;
        public final TextView mUserIdView;
        public final TextView mUsernameView;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        
            if (r3.hasNext() == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
        
            r2 = (java.util.Map.Entry) r3.next();
            r1 = (java.lang.String) r2.getKey();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
        
            if (r1.equals(r5) != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
        
            r4.append(r1);
            r4.append(":\n\t");
            r4.append(r2.getValue());
            r4.append("\n");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
        
            r7.mOtherScoresView.setText(r4.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
        
            r7.mOtherScoresView.setVisibility(8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r3.size() >= 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
        
            if (r3.size() >= 2) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
        
            r7.mOtherScoresView.setVisibility(0);
            r4 = new java.lang.StringBuilder("Also appears in:\n");
            r3 = X.AbstractC166997dE.A15(r3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void bindScores(com.instagram.debug.devoptions.search.bootstrap.BootstrapUserInfo r8) {
            /*
                r7 = this;
                java.util.Map r3 = r8.surfaceToScoreMap
                com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter r0 = com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.this
                X.5ou r0 = r0.mSurface
                java.lang.String r5 = r0.A01
                java.util.Iterator r6 = X.AbstractC166997dE.A15(r3)
            Lc:
                boolean r0 = r6.hasNext()
                r2 = 1
                r4 = 0
                if (r0 == 0) goto L86
                java.lang.Object r1 = X.MSZ.A0m(r6)
                java.lang.String r1 = (java.lang.String) r1
                com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter r0 = com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.this
                X.5ou r0 = r0.mSurface
                java.lang.String r0 = r0.A01
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Lc
                android.widget.TextView r0 = r7.mScoreView
                r0.setVisibility(r4)
                android.widget.TextView r2 = r7.mScoreView
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "Score: "
                r1.append(r0)
                java.lang.Object r0 = r3.get(r5)
                java.lang.String r0 = X.AbstractC166997dE.A0v(r0, r1)
                r2.setText(r0)
                int r1 = r3.size()
                r0 = 2
                if (r1 < r0) goto L9d
            L49:
                android.widget.TextView r0 = r7.mOtherScoresView
                r0.setVisibility(r4)
                java.lang.String r0 = "Also appears in:\n"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r0)
                java.util.Iterator r3 = X.AbstractC166997dE.A15(r3)
            L59:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L93
                java.lang.Object r2 = r3.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r1 = r2.getKey()
                java.lang.String r1 = (java.lang.String) r1
                boolean r0 = r1.equals(r5)
                if (r0 != 0) goto L59
                r4.append(r1)
                java.lang.String r0 = ":\n\t"
                r4.append(r0)
                java.lang.Object r0 = r2.getValue()
                r4.append(r0)
                java.lang.String r0 = "\n"
                r4.append(r0)
                goto L59
            L86:
                android.widget.TextView r1 = r7.mScoreView
                r0 = 4
                r1.setVisibility(r0)
                int r0 = r3.size()
                if (r0 < r2) goto L9d
                goto L49
            L93:
                android.widget.TextView r1 = r7.mOtherScoresView
                java.lang.String r0 = r4.toString()
                r1.setText(r0)
                return
            L9d:
                android.widget.TextView r1 = r7.mOtherScoresView
                r0 = 8
                r1.setVisibility(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.UserInfoViewHolder.bindScores(com.instagram.debug.devoptions.search.bootstrap.BootstrapUserInfo):void");
        }

        public void bind(BootstrapUserInfo bootstrapUserInfo) {
            int i;
            boolean A03 = AbstractC81033jX.A03(bootstrapUserInfo.user.Bhu());
            CircularImageView circularImageView = this.mAvatarView;
            if (!A03) {
                circularImageView.setUrl(bootstrapUserInfo.user.Bhu(), BootstrapUsersAdapter.this.mAnalyticsModule);
                circularImageView = this.mAvatarView;
                i = 0;
            } else {
                i = 4;
            }
            circularImageView.setVisibility(i);
            MSX.A15(this.mRankView, bootstrapUserInfo.rank);
            AbstractC31173DnH.A1F(this.mUsernameView, bootstrapUserInfo.user);
            this.mUserIdView.setText(bootstrapUserInfo.user.getId());
            bindScores(bootstrapUserInfo);
        }

        /* renamed from: lambda$new$0$com-instagram-debug-devoptions-search-bootstrap-BootstrapUsersAdapter$UserInfoViewHolder, reason: not valid java name */
        public /* synthetic */ void m91x59a7e0f(View view) {
            BootstrapUsersAdapter bootstrapUsersAdapter = BootstrapUsersAdapter.this;
            bootstrapUsersAdapter.mDelegate.onUserClick((BootstrapUserInfo) bootstrapUsersAdapter.mFilteredUsers.get(getBindingAdapterPosition()));
        }

        /* renamed from: lambda$new$1$com-instagram-debug-devoptions-search-bootstrap-BootstrapUsersAdapter$UserInfoViewHolder, reason: not valid java name */
        public /* synthetic */ boolean m92x3d8b592e(View view) {
            BootstrapUsersAdapter bootstrapUsersAdapter = BootstrapUsersAdapter.this;
            bootstrapUsersAdapter.mDelegate.onUserLongClick((BootstrapUserInfo) bootstrapUsersAdapter.mFilteredUsers.get(getBindingAdapterPosition()));
            return true;
        }

        public UserInfoViewHolder(View view) {
            super(view);
            this.mAvatarView = (CircularImageView) view.requireViewById(R.id.avatar);
            this.mRankView = (TextView) view.requireViewById(R.id.rank);
            this.mUsernameView = (TextView) view.requireViewById(R.id.username);
            this.mUserIdView = (TextView) view.requireViewById(R.id.user_id);
            this.mScoreView = (TextView) view.requireViewById(R.id.score);
            this.mOtherScoresView = (TextView) view.requireViewById(R.id.other_scores);
            C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter$UserInfoViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BootstrapUsersAdapter.UserInfoViewHolder.this.m91x59a7e0f(view2);
                }
            }, view);
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter$UserInfoViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return BootstrapUsersAdapter.UserInfoViewHolder.this.m92x3d8b592e(view2);
                }
            });
        }
    }

    private boolean matchesFilter(BootstrapUserInfo bootstrapUserInfo, String str) {
        User user = bootstrapUserInfo.user;
        user.getUsername();
        if (!user.getUsername().startsWith(str) && ((user.getFullName() == null || !user.getFullName().startsWith(str)) && !user.getId().startsWith(str))) {
            return false;
        }
        return true;
    }

    public void applyFilterText(String str) {
        this.mFilteredUsers.clear();
        if (TextUtils.isEmpty(str)) {
            this.mFilteredUsers.addAll(this.mUnfilteredUsers);
        } else {
            for (BootstrapUserInfo bootstrapUserInfo : this.mUnfilteredUsers) {
                if (matchesFilter(bootstrapUserInfo, str)) {
                    this.mFilteredUsers.add(bootstrapUserInfo);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public void onBindViewHolder(UserInfoViewHolder userInfoViewHolder, int i) {
        userInfoViewHolder.bind((BootstrapUserInfo) this.mFilteredUsers.get(i));
    }

    public void setUnfilteredUsers(List list) {
        this.mUnfilteredUsers.clear();
        this.mUnfilteredUsers.addAll(list);
        applyFilterText("");
    }

    public BootstrapUsersAdapter(InterfaceC11380iw interfaceC11380iw, Delegate delegate, C127165ou c127165ou) {
        this.mAnalyticsModule = interfaceC11380iw;
        this.mDelegate = delegate;
        this.mSurface = c127165ou;
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(-1292144059);
        int size = this.mFilteredUsers.size();
        C0f9.A0A(-1675213805, A03);
        return size;
    }

    @Override // X.C2UU
    public UserInfoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UserInfoViewHolder(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.bootstrap_user_info));
    }
}
