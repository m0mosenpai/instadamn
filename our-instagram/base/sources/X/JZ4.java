package X;

import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.profile.fragment.UserDetailFragment;

/* loaded from: classes8.dex */
public final class JZ4 implements Runnable {
    public final /* synthetic */ C6C9 A00;
    public final /* synthetic */ NotesRepository A01;
    public final /* synthetic */ UserDetailFragment A02;
    public final /* synthetic */ String A03;

    public JZ4(C6C9 c6c9, NotesRepository notesRepository, UserDetailFragment userDetailFragment, String str) {
        this.A02 = userDetailFragment;
        this.A00 = c6c9;
        this.A01 = notesRepository;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserDetailFragment userDetailFragment = this.A02;
        C6C9 c6c9 = this.A00;
        UserDetailFragment.A0O(c6c9, userDetailFragment);
        if (AbstractC82073lT.A01(userDetailFragment.A0I)) {
            NotesRepository notesRepository = this.A01;
            String str = this.A03;
            notesRepository.A0K(c6c9, str);
            C72S.A00(userDetailFragment.A0I).A01.put(str, AbstractC31173DnH.A0g());
        }
    }
}
