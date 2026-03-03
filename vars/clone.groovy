/*def call(String url, String branch){
      
      echo "This is cloning the code"
      git url: "https://github.com/harshjani02/django-notes-app.git", branch:"main"
      echo "code cloning successfully"
}
*/
def call(String url, String branch){

    git url: "${url}", branch: "${branch}"
      
}
